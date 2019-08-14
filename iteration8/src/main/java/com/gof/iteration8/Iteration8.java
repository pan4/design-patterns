package com.gof.iteration8;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.core.DataAPI;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class Iteration8 {

    public static void run() {
        RemoteOutputAPITesting apiTesting = new RemoteOutputAPITesting();

        DataAPI dataA = new DataAPIBuilder(1L)
                .dataMX(randomAlphabetic(10))
                .dataSX(randomAlphabetic(10))
                .build();
        apiTesting.setOutputData(dataA);

        DataAPI dataB = new DataAPIBuilder(1L)
                .dataFX(randomAlphabetic(10))
                .dataBX(randomAlphabetic(10))
                .build();
        apiTesting.setOutputData(dataB);

        DataAPI dataC = new DataAPIBuilder(1L)
                .dataMX(randomNumeric(10))
                .dataSX(randomAlphabetic(10))
                .dataFX(randomAlphabetic(10))
                .dataBX(randomNumeric(10))
                .build();
        apiTesting.setOutputData(dataC);
    }

}