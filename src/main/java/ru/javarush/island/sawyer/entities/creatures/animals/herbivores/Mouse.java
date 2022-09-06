package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "mouse", icon = "\uD83D\uDC2D", weight = 0, speed = 0, totalFoodWeight = 0, maxToSpawn = 0)
public class Mouse extends Herbivore{
    public Mouse(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodWeight, maxToSpawn);
    }
}
