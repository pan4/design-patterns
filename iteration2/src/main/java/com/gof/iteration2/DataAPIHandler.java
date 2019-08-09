package com.gof.iteration2;

import com.gof.customer.core.DataAPI;

public abstract class DataAPIHandler {
    private DataAPIHandler next;

    public DataAPIHandler(DataAPIHandler next) {
        this.next = next;
    }

    public DataAPI handle(DataAPI dataAPI) {
        if (next != null) {
            next.handle(dataAPI);
        }
        return dataAPI;
    }
}
