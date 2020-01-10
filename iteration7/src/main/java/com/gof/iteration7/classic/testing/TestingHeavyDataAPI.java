package com.gof.iteration7.classic.testing;

import com.gof.customer.data.TypeOfData;
import com.gof.iteration7.classic.HeavyDataAPI;

import java.util.concurrent.ThreadLocalRandom;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class TestingHeavyDataAPI extends HeavyDataAPI {
    public TestingHeavyDataAPI() {
        super(ThreadLocalRandom.current().nextLong(),
                TypeOfData.getValueByOrdinal(ThreadLocalRandom.current().nextInt(TypeOfData.values().length)),
                randomNumeric(10),
                randomNumeric(10),
                randomNumeric(10),
                randomNumeric(10)
        );
    }
}
