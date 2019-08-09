package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class PreparedDataAPIHandler extends DataAPIHandler {
    public PreparedDataAPIHandler(DataAPIHandler next) {
        super(next);
    }

    @Override
    public DataAPI handle(DataAPI dataAPI) {
        if (TypeOfData.PREPARED == dataAPI.getTypeOfData()) {
            dataAPI.setDataFX(dataAPI.getDataFX().concat("2"));
        } else {
            super.handle(dataAPI);
        }
        return dataAPI;
    }
}
