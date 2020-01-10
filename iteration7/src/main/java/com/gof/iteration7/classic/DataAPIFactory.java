package com.gof.iteration7.classic;

public interface DataAPIFactory {
    LightDataAPI createLightDataAPI();

    HeavyDataAPI createHeavyDataAPI();
}
