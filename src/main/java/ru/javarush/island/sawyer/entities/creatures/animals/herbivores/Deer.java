package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "deer", icon = "\uD83E\uDD8C", weight = 0, speed = 0, totalFoodMass = 0, maxToSpawn = 0)
public class Deer extends Herbivore{
    public Deer(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}
