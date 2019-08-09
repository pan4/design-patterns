package com.gof.iteration8;

import com.gof.customer.core.DataAPI;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class DataAPIFactoryC implements DataAPIFactory {
    @Override
    public DataAPI createDataAPI(Long id) {
        DataAPI dataAPI = new DataAPI(id);
        dataAPI.setDataMX(randomNumeric(10));
        dataAPI.setDataSX(randomAlphabetic(10));
        dataAPI.setDataFX(randomAlphabetic(10));
        dataAPI.setDataBX(randomNumeric(10));
        return dataAPI;
    }
}
