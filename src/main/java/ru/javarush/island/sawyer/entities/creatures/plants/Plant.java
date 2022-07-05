package ru.javarush.island.sawyer.entities.creatures.plants;

import ru.javarush.island.sawyer.entities.creatures.Creature;

public abstract class Plant extends Creature {
    public Plant(String name, String icon) {
        super(name, icon);
    }

    @Override
    public void multiply() {
        System.out.println("Plant is multiplying");
    }

    @Override
    public void starveOrDie() {
        System.out.println("Plant is dying");
    }
}
