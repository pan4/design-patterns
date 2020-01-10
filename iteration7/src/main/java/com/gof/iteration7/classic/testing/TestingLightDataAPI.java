package com.gof.iteration7.classic.testing;

import com.gof.customer.data.TypeOfData;
import com.gof.iteration7.classic.LightDataAPI;

import java.util.concurrent.ThreadLocalRandom;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

public class TestingLightDataAPI extends LightDataAPI {
    public TestingLightDataAPI() {
        super(ThreadLocalRandom.current().nextLong(),
                randomAlphabetic(10),
                TypeOfData.getValueByOrdinal(ThreadLocalRandom.current().nextInt(TypeOfData.values().length))
        );
    }
}
