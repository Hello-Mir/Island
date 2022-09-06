package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "caterpillar", icon = "\uD83D\uDC1B", weight = 0, speed = 0, totalFoodWeight = 0, maxToSpawn = 0)
public class Caterpillar extends Herbivore {
    public Caterpillar(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodWeight, maxToSpawn);
    }
}
