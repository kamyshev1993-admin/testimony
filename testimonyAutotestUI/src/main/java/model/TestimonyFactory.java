package model;


import utils.RandomUtils;

import java.time.LocalDate;

public class TestimonyFactory {
    public static Testimony getRandomTestimony() {
        Testimony testimony = new Testimony();
        testimony.setLocalDate(LocalDate.now());
        testimony.setColdData(RandomUtils.getRandomBigDecimal(10.0, 20.0));
        testimony.setElecData(RandomUtils.getRandomBigDecimal(10.0, 20.0));
        testimony.setGasData(RandomUtils.getRandomBigDecimal(10.0, 20.0));
        testimony.setHotData(RandomUtils.getRandomBigDecimal(10.0, 20.0));
        return testimony;
    }
}
