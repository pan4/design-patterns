package com.gof.iteration2;

import com.gof.customer.core.Channel1;
import com.gof.customer.core.DataAPI;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertTrue;

public class Iteration2Test {

    private Channel1 channel1 = new Channel1();

    @Test
    public void testRun() {
        Iteration2.run(channel1.getDataAPI());
    }

    @Test
    public void testDataApiHandlerChain() {
        List<DataAPI> data = channel1.getDataAPI();
        List<String> origins = data.stream().map(dataAPI -> dataAPI.getDataFX()).collect(Collectors.toList());
        data = data.stream()
                .map(dataAPI -> Iteration2.chain.handle(new DataAPIRequest(dataAPI)))
                .collect(Collectors.toList());
        for (int i = 0; i < data.size(); i++) {
            String result = data.get(i).getDataFX();
            String origin = origins.get(i);
            assertTrue(origin.equals(result.substring(0, result.length() - 1)));
            switch (data.get(i).getTypeOfData()) {
                case LIVE:
                    result.endsWith("1");
                    break;
                case PREPARED:
                    result.endsWith("2");
                    break;
                case FAKE:
                    result.endsWith("3");
                    break;
                case ERR:
                    result.endsWith("4");
                    break;
            }
        }
    }
}