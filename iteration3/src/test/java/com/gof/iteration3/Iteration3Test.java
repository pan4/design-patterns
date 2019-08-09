package com.gof.iteration3;

import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Iteration3Test {

    private Channel2 channel2 = new Channel2();

    @Test
    public void testRun() {
        Iteration3.run(channel2.getDataAPI());
    }

    @Test
    public void testDataApiAdapter(){
        DataAPI dataAPI = channel2.getDataAPI().get(0);
        DataAPIAdapter dataApiAdapter = new DataAPIAdapter(dataAPI);
        assertEquals(dataAPI.getDataFX()
                .concat(dataAPI.getDataMX())
                .concat(dataAPI.getDataSX())
                .concat(dataAPI.getDataBX()), dataApiAdapter.getDataFX());
        assertEquals(dataAPI.getResultX(), dataApiAdapter.getDataFX());
    }
}