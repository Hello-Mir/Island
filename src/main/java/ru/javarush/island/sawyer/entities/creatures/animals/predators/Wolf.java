package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "wolf", icon = "\uD83D\uDC3A")
public class Wolf extends Predator {
    public Wolf(String name, String icon) {
        super(name, icon);
    }
}
