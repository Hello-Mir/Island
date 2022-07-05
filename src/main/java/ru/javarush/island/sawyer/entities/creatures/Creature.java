package ru.javarush.island.sawyer.entities.creatures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public abstract class Creature {
    private String name;
    private String icon;

    public Creature(String name, String icon) {

        this.name = name;
        this.icon = icon;
    }

    @JsonGetter("name")
    public String getName() {
        return name;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("icon")
    public String getIcon() {
        return icon;
    }

    @JsonSetter("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void move() {

    }

    public void eat() {

    }

    public void multiply() {

    }

    public void starveOrDie() { //todo-- не упомянут в числе обязательных

    }

    @Override
    public String toString() {
        return getIcon();
    }
}
