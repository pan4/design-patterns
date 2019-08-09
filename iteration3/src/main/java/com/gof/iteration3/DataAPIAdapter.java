package com.gof.iteration3;

import com.gof.customer.core.DataAPI;

public class DataAPIAdapter extends DataAPI {
    private DataAPI dataAPI;

    public DataAPIAdapter(DataAPI dataAPI) {
        super(dataAPI.getId(), dataAPI.getTypeOfData(), dataAPI.getDataFX(), dataAPI.getDataMX(),
                dataAPI.getDataSX(), dataAPI.getDataBX());
        this.dataAPI = dataAPI;
    }

    @Override
    public String getDataFX() {
        String result = super.getDataFX()
                .concat(getDataMX())
                .concat(getDataSX())
                .concat(getDataBX());
        setResultX(result);
        dataAPI.setResultX(result);
        return result;
    }
}
