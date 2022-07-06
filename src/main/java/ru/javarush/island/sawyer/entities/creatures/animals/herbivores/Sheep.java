package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "sheep", icon = "\uD83D\uDC11")
public class Sheep extends Herbivore {
    public Sheep(String name, String icon) {
        super(name, icon);
    }
}
