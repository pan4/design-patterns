package com.gof.iteration2;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class DataAPIRequest extends DataAPI {

    private boolean handled;

    public DataAPIRequest(Long id, String dataFX, TypeOfData typeOfData) {
        super(id, dataFX, typeOfData);
    }

    public DataAPIRequest(DataAPI dataAPI) {
        super(dataAPI.getId(), dataAPI.getDataFX(), dataAPI.getTypeOfData());
    }

    public boolean isHandled() {
        return handled;
    }

    public void setHandled(boolean handled) {
        this.handled = handled;
    }
}
