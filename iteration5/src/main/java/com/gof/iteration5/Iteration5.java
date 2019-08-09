package com.gof.iteration5;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.DataAPI;

import java.util.List;

public class Iteration5 {

    private static RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();
    private static RemoteOutputAPIAcronisFacade acronisFacade = new RemoteOutputAPIAcronisFacade();

    public static void run(List<DataAPI> data) {
        data.forEach(dataAPI -> {
            remoteOutputAPI.setOutputData(dataAPI);
            acronisFacade.setOutputData(dataAPI);
        });
    }

}