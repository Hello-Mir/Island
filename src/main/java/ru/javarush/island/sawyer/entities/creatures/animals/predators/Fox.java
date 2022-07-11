package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.abstractions.CreatureData;
import ru.javarush.island.sawyer.entities.creatures.animals.Animal;

@CreatureData(name = "fox", icon = "\uD83E\uDD8A", weight = 0, speed = 0, totalFoodMass = 0, maxToSpawn = 0)
public class Fox extends Animal {

    public Fox(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}

