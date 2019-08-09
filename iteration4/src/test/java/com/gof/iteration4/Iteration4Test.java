package com.gof.iteration4;

import com.gof.customer.core.Channel2;
import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Iteration4Test {

    @Test
    public void testRun() {
        Channel2 channel2 = new Channel2();
        Iteration4.run(channel2.getDataAPI());
    }

    @Test
    public void testDataApiProcessor() {
        DataAPI dataAPI1 = new DataAPI(1L, TypeOfData.LIVE, "fx0", "mx", "sx0", "bx");
        DataAPI dataAPI2 = new DataAPI(2L, TypeOfData.PREPARED, "fx0", "mx", "sx0", "bx");
        DataAPI dataAPI3 = new DataAPI(3L, TypeOfData.FAKE, "fx0", "mx", "sx0", "bx");
        DataAPI dataAPI4 = new DataAPI(4L, TypeOfData.ERR, "fx0", "mx", "sx0", "bx");

        assertEquals(DataAPIProcessor.process(dataAPI1).getDataFX(), "fx1mxsx1bx");
        assertEquals(DataAPIProcessor.process(dataAPI2).getDataFX(), "fx358mxsx358bx");
        assertEquals(DataAPIProcessor.process(dataAPI3).getDataFX(), "fx#mxsx#bx");
        assertEquals(DataAPIProcessor.process(dataAPI4).getDataFX(), "fxERmxsxERbx");
    }
}