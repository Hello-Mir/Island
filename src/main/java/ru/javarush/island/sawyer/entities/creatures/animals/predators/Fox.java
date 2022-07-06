package ru.javarush.island.sawyer.entities.creatures.animals.predators;

import ru.javarush.island.sawyer.abstractions.CreatureData;
import ru.javarush.island.sawyer.entities.creatures.animals.Animal;

@CreatureData(name = "fox", icon = "\uD83E\uDD8A")
public class Fox extends Animal {
    public Fox(String name, String icon) {
        super(name, icon);
    }
}

