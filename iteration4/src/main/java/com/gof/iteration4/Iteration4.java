package com.gof.iteration4;

import com.gof.customer.core.DataAPI;

import java.util.List;

public class Iteration4 {

    public static void run(List<DataAPI> data) {
        data.forEach(dataAPI -> DataAPIProcessor.process(dataAPI));
    }
}