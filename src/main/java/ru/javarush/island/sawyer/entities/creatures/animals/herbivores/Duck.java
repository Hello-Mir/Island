package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "duck", icon = "\uD83E\uDD86", weight = 0, speed = 0, totalFoodMass = 0, maxToSpawn = 0)
public class Duck extends Herbivore{
    public Duck(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}
