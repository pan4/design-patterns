package com.gof.iteration8;

import com.gof.customer.core.DataAPI;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class Iteration8Test {

    @Test
    public void testRun() {
        Iteration8.run();
    }

    @Test
    public void testDataAPIFactories(){
        Pattern chars = Pattern.compile("^[a-zA-Z]+$");
        Pattern nums = Pattern.compile("^[0-9]+$");

        DataAPI dataA = new DataAPIFactoryA().createDataAPI(1L);
        assertTrue(chars.matcher(dataA.getDataMX()).matches());
        assertTrue(chars.matcher(dataA.getDataSX()).matches());

        DataAPI dataB = new DataAPIFactoryB().createDataAPI(2L);
        assertTrue(chars.matcher(dataB.getDataFX()).matches());
        assertTrue(chars.matcher(dataB.getDataBX()).matches());

        DataAPI dataC = new DataAPIFactoryC().createDataAPI(3L);
        assertTrue(nums.matcher(dataC.getDataMX()).matches());
        assertTrue(chars.matcher(dataC.getDataSX()).matches());
        assertTrue(chars.matcher(dataC.getDataFX()).matches());
        assertTrue(nums.matcher(dataC.getDataBX()).matches());
    }
}