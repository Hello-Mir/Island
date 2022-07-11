package ru.javarush.island.sawyer.entities.creatures.animals;

import ru.javarush.island.sawyer.entities.creatures.Creature;

public abstract class Animal extends Creature {
    public Animal(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}
