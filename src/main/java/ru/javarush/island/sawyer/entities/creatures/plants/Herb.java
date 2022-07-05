package ru.javarush.island.sawyer.entities.creatures.plants;

import ru.javarush.island.sawyer.abstractions.CreatureData;

@CreatureData(name = "Grass", icon = "\uD83C\uDF3F")
public class Herb extends Plant {
    public Herb(String name, String icon) {
        super(name, icon);
    }
}
