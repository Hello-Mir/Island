package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "horse", icon = "\uD83D\uDC0E", weight = 0, speed = 0, totalFoodWeight = 0, maxToSpawn = 0)
public class Horse extends Herbivore{
    public Horse(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodWeight, maxToSpawn);
    }
}
