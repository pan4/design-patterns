package com.gof.iteration7;

import com.gof.customer.RemoteOutputAPITesting;
import com.gof.customer.core.DataAPI;
import com.gof.iteration7.lambdabased.DataAPIFactory;
import com.gof.iteration7.lambdabased.DataAPIType;

public class Iteration7 {

    public static void run(){
        RemoteOutputAPITesting apiTesting = new RemoteOutputAPITesting();
        DataAPIFactory factory = DataAPIFactory.apiTestingFactory();

        DataAPI dataAPILight1 = factory.create(DataAPIType.LIGHT);
        apiTesting.setOutputData(dataAPILight1);
        DataAPI dataAPILight2 = factory.create(DataAPIType.LIGHT);
        apiTesting.setOutputData(dataAPILight2);
        DataAPI dataAPIHeavy1 = factory.create(DataAPIType.HEAVY);
        apiTesting.setOutputData(dataAPIHeavy1);
        DataAPI dataAPIHeavy2 = factory.create(DataAPIType.HEAVY);
        apiTesting.setOutputData(dataAPIHeavy2);
    }

}