package ru.javarush.island.sawyer.entities.creatures.animals.herbivores;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "rabbit", icon = "\uD83D\uDC07")
public class Rabbit extends Herbivore {
    public Rabbit(String name, String icon) {
    super(name,icon);
    }

}
