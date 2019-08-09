package com.gof.iteration2;

import com.gof.customer.RemoteOutputAPI;
import com.gof.customer.core.DataAPI;

import java.util.List;

public class Iteration2 {

    private static DataAPIHandler chain =
            new LiveDataAPIHandler(new PreparedDataAPIHandler(new FakeDataAPIHandler(new ErrDataAPIHandler(null))));

    private static RemoteOutputAPI remoteOutputAPI = new RemoteOutputAPI();

    public static void run(List<DataAPI> data) {
        data.forEach(dataAPI -> remoteOutputAPI.setOutputData(chain.handle(dataAPI)));
    }
}
