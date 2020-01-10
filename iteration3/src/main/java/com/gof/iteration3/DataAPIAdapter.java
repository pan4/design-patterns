package com.gof.iteration3;

import com.gof.customer.core.DataAPI;

public class DataAPIAdapter extends DataAPI {

    public DataAPIAdapter(DataAPI dataAPI) {
        super(dataAPI.getId(), dataAPI.getTypeOfData(), dataAPI.getDataFX(), dataAPI.getDataMX(),
                dataAPI.getDataSX(), dataAPI.getDataBX());
    }

    @Override
    public String getDataFX() {
        if (getResultX() == null) {
            String result = super.getDataFX()
                    .concat(getDataMX())
                    .concat(getDataSX())
                    .concat(getDataBX());
            setResultX(result);
        }
        return getResultX();
    }
}
