package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "duck", icon = "\uD83E\uDD86")
public class Duck extends Herbivore{
    public Duck(String name, String icon) {
        super(name, icon);
    }
}
