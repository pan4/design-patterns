package com.gof.iteration7;

import com.gof.customer.core.DataAPI;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class Iteration7Test {

    @Test
    public void testRun() {
        Iteration7.run();
    }

    @Test
    public void testDataAPIFactory() {
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
}