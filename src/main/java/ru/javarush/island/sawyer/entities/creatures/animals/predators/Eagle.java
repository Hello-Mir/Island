package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "eagle", icon = "\uD83E\uDD85")
public class Eagle extends Predator{
    public Eagle(String name, String icon) {
        super(name, icon);
    }
}
