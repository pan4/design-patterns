package com.gof.iteration8;

import com.gof.customer.core.DataAPI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Iteration8Test {

    @Test
    public void testRun() {
        Iteration8.run();
    }

    @Test
    public void testDataAPIBuilder(){
        Long id = 1L;
        String chars = "aBcDe";
        String nums = "01234";

        DataAPI dataA = new DataAPIBuilder(id)
                .dataMX(chars)
                .dataSX(chars)
                .build();

        DataAPI dataB = new DataAPIBuilder(id)
                .dataFX(chars)
                .dataBX(chars)
                .build();

        DataAPI dataC = new DataAPIBuilder(id)
                .dataMX(nums)
                .dataSX(chars)
                .dataFX(chars)
                .dataBX(nums)
                .build();

        assertEquals(dataA.getId(), id);
        assertEquals(dataA.getDataMX(), chars);
        assertEquals(dataA.getDataSX(), chars);

        assertEquals(dataB.getId(), id);
        assertEquals(dataB.getDataFX(), chars);
        assertEquals(dataB.getDataBX(), chars);

        assertEquals(dataC.getId(), id);
        assertEquals(dataC.getDataMX(), nums);
        assertEquals(dataC.getDataSX(), chars);
        assertEquals(dataC.getDataFX(), chars);
        assertEquals(dataC.getDataBX(), nums);
    }
}