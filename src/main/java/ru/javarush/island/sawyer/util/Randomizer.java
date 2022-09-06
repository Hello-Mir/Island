package ru.javarush.island.sawyer.util;

import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {
    public static double getRandomWeight(double initialWeight) {
        double aDouble = ThreadLocalRandom.current().nextDouble(initialWeight / 2, initialWeight);
        double v = Math.round(aDouble); // todo округлить значение до первого числа из плавающей точки
        return v;
    }
}
