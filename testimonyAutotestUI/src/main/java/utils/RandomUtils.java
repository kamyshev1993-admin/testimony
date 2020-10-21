package utils;

import java.math.BigDecimal;

public class RandomUtils {

    public static BigDecimal getRandomBigDecimal(double min, double max) {
        return getRandomBigDecimal(min, max, 2);
    }

    public static BigDecimal getRandomBigDecimal(double min, double max, int scale) {
        BigDecimal minBD = new BigDecimal(min);
        BigDecimal maxBD = new BigDecimal(max);
        return minBD.add(new BigDecimal(Math.random()).multiply(maxBD.subtract(minBD)))
                .setScale(scale, BigDecimal.ROUND_HALF_UP);
    }
}
