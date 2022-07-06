package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "mouse", icon = "\uD83D\uDC2D")
public class Mouse extends Herbivore{
    public Mouse(String name, String icon) {
        super(name, icon);
    }
}
