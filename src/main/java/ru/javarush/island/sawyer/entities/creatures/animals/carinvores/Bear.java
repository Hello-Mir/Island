package ru.javarush.island.sawyer.entities.creatures.animals.carinvores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "bear", icon = "\uD83D\uDC3B", weight = 0, speed = 0, totalFoodWeight = 0, maxToSpawn = 0)
public class Bear extends Carnivore {

    public Bear(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodWeight, maxToSpawn);
    }
}
