package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class FakeDataAPIHandler extends DataAPIHandler {
    public FakeDataAPIHandler(DataAPIHandler next) {
        super(next);
    }

    @Override
    public DataAPI handle(DataAPI dataAPI) {
        if (TypeOfData.FAKE == dataAPI.getTypeOfData()) {
            dataAPI.setDataFX(dataAPI.getDataFX().concat("3"));
        } else {
            super.handle(dataAPI);
        }
        return dataAPI;
    }
}
