package ru.javarush.island.sawyer.entities.creatures.plants;

import ru.javarush.island.sawyer.entities.creatures.Creature;
import ru.javarush.island.sawyer.entities.creatures.Ration;

public abstract class Plant extends Creature {
    public Plant(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodWeight, maxToSpawn);
    }

    @Override
    public void multiply() {
        System.out.println("Plant is multiplying");
    }

    @Override
    public void starveOrDie() {
        System.out.println("Plant is dying");
    }
}
