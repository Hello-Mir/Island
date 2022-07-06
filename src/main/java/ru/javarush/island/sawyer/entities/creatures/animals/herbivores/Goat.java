package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "goat", icon = "\uD83D\uDC10")
public class Goat extends Herbivore{
    public Goat(String name, String icon) {
        super(name, icon);
    }
}
