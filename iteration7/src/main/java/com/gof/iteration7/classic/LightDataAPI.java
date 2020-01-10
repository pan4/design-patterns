package com.gof.iteration7.classic;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class LightDataAPI extends DataAPI {

    public LightDataAPI(Long id, String dataFX, TypeOfData typeOfData) {
        super(id, dataFX, typeOfData);
    }
}
