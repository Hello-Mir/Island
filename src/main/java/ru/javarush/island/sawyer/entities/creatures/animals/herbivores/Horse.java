package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "horse", icon = "\uD83D\uDC0E")
public class Horse extends Herbivore{
    public Horse(String name, String icon) {
        super(name, icon);
    }
}
