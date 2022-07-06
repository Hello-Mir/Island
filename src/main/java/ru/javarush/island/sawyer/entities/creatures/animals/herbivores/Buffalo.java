package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "buffalo", icon = "\uD83E\uDDAC")
public class Buffalo extends Herbivore{
    public Buffalo(String name, String icon) {
        super(name, icon);
    }
}
