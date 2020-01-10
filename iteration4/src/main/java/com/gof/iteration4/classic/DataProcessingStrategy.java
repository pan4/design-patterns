package com.gof.iteration4.classic;

import com.gof.customer.core.DataAPI;

@FunctionalInterface
public interface DataProcessingStrategy {
    DataAPI execute(DataAPI dataAPI);
}
