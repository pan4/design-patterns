package com.gof.iteration8;

import com.gof.customer.core.DataAPI;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class DataAPIFactoryB implements DataAPIFactory {
    @Override
    public DataAPI createDataAPI(Long id) {
        DataAPI dataAPI = new DataAPI(id);
        dataAPI.setDataFX(randomAlphabetic(10));
        dataAPI.setDataBX(randomAlphabetic(10));
        return dataAPI;
    }
}
