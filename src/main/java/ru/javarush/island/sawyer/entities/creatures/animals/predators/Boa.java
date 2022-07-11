package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "boa", icon = "\uD83D\uDC0D", weight = 0, speed = 0, totalFoodMass = 0, maxToSpawn = 0)
public class Boa extends Predator{

    public Boa(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}
