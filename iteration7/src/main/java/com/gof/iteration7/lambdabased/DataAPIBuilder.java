package com.gof.iteration7.lambdabased;

import com.gof.customer.core.DataAPI;

import java.util.function.Supplier;

public interface DataAPIBuilder {
    void add(DataAPIType type, Supplier<DataAPI> supplier);
}
