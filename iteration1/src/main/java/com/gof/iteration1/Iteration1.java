package com.gof.iteration1;

import com.gof.customer.RemoteInputAPI;
import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.DataAPI;
import com.gof.iteration1.doublecheck.RemoteOutputAPISingleton;

public class Iteration1 {

    private static final RemoteInputAPI RM_IN = new RemoteInputAPI();
    private static final RemoteOutputAPI RM_OUT = RemoteOutputAPISingleton.getInstance();

    public static void run() {
        DataAPI inputData = RM_IN.getInputData();
        RM_OUT.setOutputData(inputData.getId(), inputData.getDataFX());
    }

}
