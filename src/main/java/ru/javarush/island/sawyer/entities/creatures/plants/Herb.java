package ru.javarush.island.sawyer.entities.creatures.plants;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "Herb", icon = "\uD83C\uDF3F", weight = 0, speed = 0, totalFoodWeight = 0, maxToSpawn = 0)
public class Herb extends Plant {
    public Herb(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodWeight, maxToSpawn);
    }
}
