package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class FakeDataAPIHandler extends DataAPIHandler {
    public FakeDataAPIHandler(DataAPIHandler next) {
        super(next);
    }

    @Override
    protected DataAPIRequest handleInternal(DataAPIRequest dataAPIRequest) {
        if (TypeOfData.FAKE == dataAPIRequest.getTypeOfData()) {
            dataAPIRequest.setDataFX(dataAPIRequest.getDataFX().concat("3"));
            dataAPIRequest.setHandled(true);
        }
        return dataAPIRequest;
    }
}
