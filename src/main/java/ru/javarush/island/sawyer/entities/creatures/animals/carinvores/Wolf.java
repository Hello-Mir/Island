package ru.javarush.island.sawyer.entities.creatures.animals.carinvores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "wolf", icon = "\uD83D\uDC3A", weight = 0, speed = 0, totalFoodWeight = 0, maxToSpawn = 0)
public class Wolf extends Carnivore {

    public Wolf(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodWeight, maxToSpawn);
    }
}

