package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "bear", icon = "\uD83D\uDC3B")
public class Bear extends Predator{
    public Bear(String name, String icon) {
        super(name, icon);
    }
}
