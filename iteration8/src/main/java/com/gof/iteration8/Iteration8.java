package com.gof.iteration8;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.core.DataAPI;

public class Iteration8 {

    public static void run() {
        RemoteOutputAPITesting apiTesting = new RemoteOutputAPITesting();

        DataAPI dataA = new DataAPIFactoryA().createDataAPI(1L);
        apiTesting.setOutputData(dataA);

        DataAPI dataB = new DataAPIFactoryB().createDataAPI(2L);
        apiTesting.setOutputData(dataB);

        DataAPI dataC = new DataAPIFactoryC().createDataAPI(3L);
        apiTesting.setOutputData(dataC);
    }

}