package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "caterpillar", icon = "\uD83D\uDC1B")
public class Caterpillar extends Herbivore{
    public Caterpillar(String name, String icon) {
        super(name, icon);
    }
}
