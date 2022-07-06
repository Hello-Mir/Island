package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "boar", icon = "\uD83D\uDC17")
public class Boar extends Herbivore{
    public Boar(String name, String icon) {
        super(name, icon);
    }
}
