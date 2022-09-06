package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "rabbit", icon = "\uD83D\uDC07", weight = 2, speed = 0, totalFoodWeight = 0, maxToSpawn = 10)
public class Rabbit extends Herbivore {

    public Rabbit(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodWeight, maxToSpawn);
    }
}
