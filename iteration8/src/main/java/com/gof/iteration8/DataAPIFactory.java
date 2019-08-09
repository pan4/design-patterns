package com.gof.iteration8;

import com.gof.customer.core.DataAPI;

public interface DataAPIFactory {
    DataAPI createDataAPI(Long id);
}
