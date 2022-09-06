package ru.javarush.island.sawyer.entities.creatures;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import ru.javarush.island.sawyer.util.Randomizer;

public abstract class Creature implements Cloneable {
    private String name;
    private String icon;

    private Double weight;

    private final int speed;
    private final Double totalFoodWeight;
    private final int maxToSpawn;
    public Creature(String name, String icon, Double weight, int speed, Double totalFoodWeight, int maxToSpawn) {

        this.name = name;
        this.icon = icon;
        this.weight = weight;
        this.speed = speed;
        this.totalFoodWeight = totalFoodWeight;
        this.maxToSpawn = maxToSpawn;
    }

    @JsonGetter("name")
    public String getName() {
        return name;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxToSpawn() {
        return maxToSpawn;
    }

    @JsonGetter("icon")
    public String getIcon() {
        return icon;
    }

    @JsonSetter("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public Double getTotalFoodWeight() {
        return totalFoodWeight;
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

    @Override
    public Creature clone() {
        try {
            Creature clone = (Creature) super.clone();
            clone.setWeight(Randomizer.getRandomWeight(weight));
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
