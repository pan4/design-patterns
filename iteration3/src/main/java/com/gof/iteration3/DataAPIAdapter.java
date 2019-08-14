package com.gof.iteration3;

import com.gof.customer.core.DataAPI;

public class DataAPIAdapter extends DataAPI {
    private DataAPI dataAPI;

    public DataAPIAdapter(DataAPI dataAPI) {
        super(dataAPI.getId(), dataAPI.getTypeOfData(), dataAPI.getDataFX(), dataAPI.getDataMX(),
                dataAPI.getDataSX(), dataAPI.getDataBX());

        String result = super.getDataFX()
                .concat(getDataMX())
                .concat(getDataSX())
                .concat(getDataBX());
        setResultX(result);
        this.dataAPI = dataAPI;
        this.dataAPI.setResultX(result);
    }

    @Override
    public String getDataFX() {
        return getResultX();
    }
}
