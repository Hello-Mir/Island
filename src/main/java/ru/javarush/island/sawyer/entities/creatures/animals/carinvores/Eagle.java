package ru.javarush.island.sawyer.entities.creatures.animals.carinvores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "eagle", icon = "\uD83E\uDD85", weight = 0, speed = 0, totalFoodWeight = 0, maxToSpawn = 0)
public class Eagle extends Carnivore {

    public Eagle(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodWeight, maxToSpawn);
    }
}
