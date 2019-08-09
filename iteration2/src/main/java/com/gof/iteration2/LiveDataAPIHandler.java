package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class LiveDataAPIHandler extends DataAPIHandler {
    public LiveDataAPIHandler(DataAPIHandler next) {
        super(next);
    }

    @Override
    public DataAPI handle(DataAPI dataAPI) {
        if (TypeOfData.LIVE == dataAPI.getTypeOfData()) {
            dataAPI.setDataFX(dataAPI.getDataFX().concat("1"));
        } else {
            super.handle(dataAPI);
        }
        return dataAPI;
    }
}
