package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class LiveDataAPIHandler extends DataAPIHandler {
    public LiveDataAPIHandler(DataAPIHandler next) {
        super(next);
    }

    @Override
    protected DataAPIRequest handleInternal(DataAPIRequest dataAPIRequest) {
        if (TypeOfData.LIVE == dataAPIRequest.getTypeOfData()) {
            dataAPIRequest.setDataFX(dataAPIRequest.getDataFX().concat("1"));
            dataAPIRequest.setHandled(true);
        }
        return dataAPIRequest;
    }
}
