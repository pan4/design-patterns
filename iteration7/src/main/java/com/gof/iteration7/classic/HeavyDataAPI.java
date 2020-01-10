package com.gof.iteration7.classic;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class HeavyDataAPI extends DataAPI {

    public HeavyDataAPI(Long id, TypeOfData typeOfData, String dataFX, String dataMX, String dataSX, String dataBX) {
        super(id, typeOfData, dataFX, dataMX, dataSX, dataBX);
    }
}
