package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.entities.creatures.animals.Animal;

public class Herbivore extends Animal {

    public Herbivore(String name, String icon, Double weight, int speed, Double totalFoodMass, int maxToSpawn) {
        super(name, icon, weight, speed, totalFoodMass, maxToSpawn);
    }
}
