package com.gof.iteration4.classic;

import com.gof.customer.core.DataAPI;

public class PreparedStrategy implements DataProcessingStrategy {
    @Override
    public DataAPI execute(DataAPI dataAPI) {
        String result = dataAPI.getResultX().replaceAll("0", "358");
        dataAPI.setDataFX(result);
        return dataAPI;
    }
}
