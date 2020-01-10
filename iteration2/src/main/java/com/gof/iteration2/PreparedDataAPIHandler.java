package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class PreparedDataAPIHandler extends DataAPIHandler {
    public PreparedDataAPIHandler(DataAPIHandler next) {
        super(next);
    }

    @Override
    public DataAPIRequest handleInternal(DataAPIRequest dataAPIRequest) {
        if (TypeOfData.PREPARED == dataAPIRequest.getTypeOfData()) {
            dataAPIRequest.setDataFX(dataAPIRequest.getDataFX().concat("2"));
            dataAPIRequest.setHandled(true);
        }
        return dataAPIRequest;
    }
}
