package com.gof.iteration3;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.DataAPI;

import java.util.List;

public class Iteration3 {
    private static RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();

    public static void run(List<DataAPI> data) {
        data.forEach(dataAPI -> remoteOutputAPI.setOutputData(new DataAPIAdapter(dataAPI)));
    }

}