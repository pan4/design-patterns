package com.gof.iteration8;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

public class DataAPIBuilder {
    private Long id;
    private String dataFX;
    private String dataMX;
    private String dataSX;
    private String dataBX;
    private TypeOfData typeOfData;

    public DataAPIBuilder(Long id) {
        this.id = id;
    }

    public DataAPIBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public DataAPIBuilder dataFX(String dataFX) {
        this.dataFX = dataFX;
        return this;
    }

    public DataAPIBuilder dataMX(String dataMX) {
        this.dataMX = dataMX;
        return this;
    }

    public DataAPIBuilder dataSX(String dataSX) {
        this.dataSX = dataSX;
        return this;
    }

    public DataAPIBuilder dataBX(String dataBX) {
        this.dataBX = dataBX;
        return this;
    }

    public DataAPIBuilder typeOfData(TypeOfData typeOfData) {
        this.typeOfData = typeOfData;
        return this;
    }

    public DataAPI build(){
        return new DataAPI(id, typeOfData, dataFX, dataMX, dataSX, dataBX);
    }
}
