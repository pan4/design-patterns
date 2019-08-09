package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class ErrDataAPIHandler extends DataAPIHandler {
    public ErrDataAPIHandler(DataAPIHandler next) {
        super(next);
    }

    @Override
    public DataAPI handle(DataAPI dataAPI) {
        if (TypeOfData.ERR == dataAPI.getTypeOfData()) {
            dataAPI.setDataFX(dataAPI.getDataFX().concat("4"));
        } else {
            super.handle(dataAPI);
        }
        return dataAPI;
    }
}
