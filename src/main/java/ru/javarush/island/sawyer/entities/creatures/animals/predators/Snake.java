package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "snake", icon = "\uD83D\uDC0D")
public class Snake extends Predator{
    public Snake(String name, String icon) {
        super(name, icon);
    }
}
