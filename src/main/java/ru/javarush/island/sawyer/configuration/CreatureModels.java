package ru.javarush.island.sawyer.configuration;

import ru.javarush.island.sawyer.entities.creatures.animals.herbivores.*;
import ru.javarush.island.sawyer.entities.creatures.animals.predators.*;
import ru.javarush.island.sawyer.entities.creatures.plants.Herb;

public final class CreatureModels {
    private final Fox fox;
    private final Boar boar;
    private final Bear bear;
    private final Deer deer;
    private final Duck duck;
    private final Goat goat;
    private final Herb herb;
    private final Wolf wolf;
    private final Eagle eagle;
    private final Horse horse;
    private final Mouse mouse;
    private final Boa boa;
    private final Sheep sheep;
    private final Rabbit rabbit;
    private final Buffalo buffalo;
    private final Caterpillar caterpillar;

    public CreatureModels(Fox fox, Boar boar, Bear bear,
                          Deer deer, Duck duck, Goat goat,
                          Herb herb, Wolf wolf, Eagle eagle,
                          Horse horse, Mouse mouse, Boa boa,
                          Sheep sheep, Rabbit rabbit, Buffalo buffalo, Caterpillar caterpillar) {
        this.fox = fox;
        this.boar = boar;
        this.bear = bear;
        this.deer = deer;
        this.duck = duck;
        this.goat = goat;

        this.herb = herb;
        this.wolf = wolf;
        this.eagle = eagle;
        this.horse = horse;
        this.mouse = mouse;
        this.boa = boa;
        this.sheep = sheep;
        this.rabbit = rabbit;
        this.buffalo = buffalo;
        this.caterpillar = caterpillar;
    }

    @Override
    public String toString() {
        return "CreatureModels{" +
                "fox=" + fox +
                ", boar=" + boar +
                ", bear=" + bear +
                ", deer=" + deer +
                ", duck=" + duck +
                ", goat=" + goat +
                ", herb=" + herb +
                ", wolf=" + wolf +
                ", eagle=" + eagle +
                ", horse=" + horse +
                ", mouse=" + mouse +
                ", boa=" + boa +
                ", sheep=" + sheep +
                ", rabbit=" + rabbit +
                ", buffalo=" + buffalo +
                ", caterpillar=" + caterpillar +
                '}';
    }
}
