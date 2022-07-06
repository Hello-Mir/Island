package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "deer", icon = "\uD83E\uDD8C")
public class Deer extends Herbivore{
    public Deer(String name, String icon) {
        super(name, icon);
    }
}
