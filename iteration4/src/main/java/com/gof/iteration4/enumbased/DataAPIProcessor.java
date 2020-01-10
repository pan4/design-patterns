package com.gof.iteration4.enumbased;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public enum DataAPIProcessor {
    LIVE_STRATEGY {
        @Override
        public DataAPI execute(DataAPI dataAPI) {
            String result = dataAPI.getResultX().replaceAll("0", "1");
            dataAPI.setDataFX(result);
            return dataAPI;
        }
    },
    PREPARED_STRATEGY {
        @Override
        public DataAPI execute(DataAPI dataAPI) {
            String result = dataAPI.getResultX().replaceAll("0", "358");
            dataAPI.setDataFX(result);
            return dataAPI;
        }
    },
    FAKE_STRATEGY {
        @Override
        public DataAPI execute(DataAPI dataAPI) {
            String result = dataAPI.getResultX().replaceAll("0", "#");
            dataAPI.setDataFX(result);
            return dataAPI;
        }
    },
    ERR_STRATEGY {
        @Override
        public DataAPI execute(DataAPI dataAPI) {
            String result = dataAPI.getResultX().replaceAll("0", "ER");
            dataAPI.setDataFX(result);
            return dataAPI;
        }
    };

    protected abstract DataAPI execute(DataAPI dataAPI);

    public static DataAPI process(DataAPI dataAPI) {
        String concat = dataAPI.getDataFX()
                .concat(dataAPI.getDataMX())
                .concat(dataAPI.getDataSX())
                .concat(dataAPI.getDataBX());
        dataAPI.setResultX(concat);
        return getStrategy(dataAPI.getTypeOfData()).execute(dataAPI);
    }

    private static DataAPIProcessor getStrategy(TypeOfData type) {
        switch (type) {
            case LIVE:
                return LIVE_STRATEGY;
            case PREPARED:
                return PREPARED_STRATEGY;
            case FAKE:
                return FAKE_STRATEGY;
            case ERR:
                return ERR_STRATEGY;
            default:
                return null;
        }
    }
}
