package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "eagle", icon = "\uD83E\uDD85", weight = 0, speed = 0, totalFoodMass = 0, maxToSpawn = 0)
public class Eagle extends Predator{

    public Eagle(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}
