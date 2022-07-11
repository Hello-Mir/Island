package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "rabbit", icon = "\uD83D\uDC07", weight = 0, speed = 0, totalFoodMass = 0, maxToSpawn = 0)
public class Rabbit extends Herbivore {

    public Rabbit(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}
