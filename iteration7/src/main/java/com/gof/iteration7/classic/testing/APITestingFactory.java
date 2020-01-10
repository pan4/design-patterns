package com.gof.iteration7.classic.testing;

import com.gof.iteration7.classic.DataAPIFactory;
import com.gof.iteration7.classic.HeavyDataAPI;
import com.gof.iteration7.classic.LightDataAPI;

public class APITestingFactory implements DataAPIFactory {
    @Override
    public LightDataAPI createLightDataAPI() {
        return new TestingLightDataAPI();
    }

    @Override
    public HeavyDataAPI createHeavyDataAPI() {
        return new TestingHeavyDataAPI();
    }
}
