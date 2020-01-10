package com.gof.iteration7.lambdabased;

import com.gof.customer.core.DataAPI;
import com.gof.customer.data.TypeOfData;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public interface DataAPIFactory {
    DataAPI create(DataAPIType type);

    static DataAPIFactory factory(Consumer<DataAPIBuilder> consumer){
        Map<DataAPIType, Supplier<DataAPI>> map = new HashMap<>();
        consumer.accept(map::put);
        return type -> map.get(type).get();
    }

    static DataAPIFactory apiTestingFactory(){
        AtomicLong counter = new AtomicLong();
        return factory(builder -> {
            builder.add(DataAPIType.LIGHT, () -> new DataAPI(counter.incrementAndGet(), randomAlphabetic(10),
                    TypeOfData.getValueByOrdinal(ThreadLocalRandom.current().nextInt(TypeOfData.values().length))));

            builder.add(DataAPIType.HEAVY, () -> new DataAPI(counter.incrementAndGet(),
                    TypeOfData.getValueByOrdinal(ThreadLocalRandom.current().nextInt(TypeOfData.values().length)),
                    randomNumeric(10), randomNumeric(10), randomNumeric(10), randomNumeric(10)));
        });
    }
}
