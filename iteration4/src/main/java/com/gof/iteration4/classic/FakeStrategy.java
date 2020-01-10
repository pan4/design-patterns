package com.gof.iteration4.classic;

import com.gof.customer.core.DataAPI;

public class FakeStrategy implements DataProcessingStrategy {
    @Override
    public DataAPI execute(DataAPI dataAPI) {
        String result = dataAPI.getResultX().replaceAll("0", "#");
        dataAPI.setDataFX(result);
        return dataAPI;
    }
}
