package ru.javarush.island.sawyer.configuration;

import ru.javarush.island.sawyer.entities.creatures.animals.herbivores.Rabbit;
import ru.javarush.island.sawyer.entities.creatures.animals.predators.Fox;
import ru.javarush.island.sawyer.entities.creatures.plants.Herb;

public final class CreatureModels {
    private Rabbit rabbit;
    private Fox fox;
    private Herb herb;
    public CreatureModels(Rabbit rabbit, Fox fox, Herb herb) {
        this.rabbit = rabbit;
        this.fox = fox;
        this.herb = herb;
    }

    @Override
    public String toString() {
        return "CreatureModels{" +
                "rabbit=" + rabbit +
                ", fox=" + fox +
                ", herb=" + herb +
                '}';
    }
}