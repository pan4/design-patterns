package com.gof.iteration7;

import com.gof.customer.core.DataAPI;
import com.gof.iteration7.classic.HeavyDataAPI;
import com.gof.iteration7.classic.LightDataAPI;
import com.gof.iteration7.classic.testing.APITestingFactory;
import com.gof.iteration7.lambdabased.DataAPIFactory;
import com.gof.iteration7.lambdabased.DataAPIType;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class Iteration7Test {

    @Test
    public void testRun() {
        Iteration7.run();
    }

    @Test
    public void testLambdaBasedDataAPIFactory() {
        Pattern chars = Pattern.compile("^[a-zA-Z]+$");
        Pattern nums = Pattern.compile("^[0-9]+$");

        DataAPIFactory factory = DataAPIFactory.apiTestingFactory();

        DataAPI dataAPILight = factory.create(DataAPIType.LIGHT);
        assertTrue(chars.matcher(dataAPILight.getDataFX()).matches());

        DataAPI dataAPIHeavy = factory.create(DataAPIType.HEAVY);
        assertTrue(nums.matcher(dataAPIHeavy.getDataFX()
                .concat(dataAPIHeavy.getDataMX())
                .concat(dataAPIHeavy.getDataSX())
                .concat(dataAPIHeavy.getDataBX())).matches());
    }

    @Test
    public void testClassicDataAPIFactory(){
        Pattern chars = Pattern.compile("^[a-zA-Z]+$");
        Pattern nums = Pattern.compile("^[0-9]+$");

        com.gof.iteration7.classic.DataAPIFactory factory = new APITestingFactory();

        LightDataAPI dataAPILight = factory.createLightDataAPI();
        assertTrue(chars.matcher(dataAPILight.getDataFX()).matches());

        HeavyDataAPI dataAPIHeavy = factory.createHeavyDataAPI();
        assertTrue(nums.matcher(dataAPIHeavy.getDataFX()
                .concat(dataAPIHeavy.getDataMX())
                .concat(dataAPIHeavy.getDataSX())
                .concat(dataAPIHeavy.getDataBX())).matches());
    }
}