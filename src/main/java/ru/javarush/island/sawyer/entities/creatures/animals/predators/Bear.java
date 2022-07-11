package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "bear", icon = "\uD83D\uDC3B", weight = 0, speed = 0, totalFoodMass = 0, maxToSpawn = 0)
public class Bear extends Predator{

    public Bear(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}
