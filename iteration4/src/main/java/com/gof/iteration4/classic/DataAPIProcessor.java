package com.gof.iteration4.classic;

import com.gof.customer.core.DataAPI;

public class DataAPIProcessor {
    private DataProcessingStrategy strategy;

    public DataAPIProcessor(DataProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public DataAPI process(DataAPI dataAPI){
        String concat = dataAPI.getDataFX()
                .concat(dataAPI.getDataMX())
                .concat(dataAPI.getDataSX())
                .concat(dataAPI.getDataBX());
        dataAPI.setResultX(concat);

        return strategy.execute(dataAPI);
    }

    public void changeStrategy(DataProcessingStrategy strategy){
        this.strategy = strategy;
    }
}
