package com.gof.iteration2;

import com.gof.customer.data.TypeOfData;

public class ErrDataAPIHandler extends DataAPIHandler {
    public ErrDataAPIHandler(DataAPIHandler next) {
        super(next);
    }

    @Override
    protected DataAPIRequest handleInternal(DataAPIRequest dataAPIRequest) {
        if (TypeOfData.ERR == dataAPIRequest.getTypeOfData()) {
            dataAPIRequest.setDataFX(dataAPIRequest.getDataFX().concat("4"));
            dataAPIRequest.setHandled(true);
        }
        return dataAPIRequest;
    }
}
