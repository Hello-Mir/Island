package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.entities.creatures.animals.Animal;

public class Predator extends Animal {
    public Predator(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}
