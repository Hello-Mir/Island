package ru.javarush.island.sawyer.services;

import ru.javarush.island.sawyer.abstractions.CreatureData;
import ru.javarush.island.sawyer.entities.creatures.Creature;
import ru.javarush.island.sawyer.entities.creatures.animals.herbivores.Rabbit;
import ru.javarush.island.sawyer.exceptions.IslandExceptionTypes;
import ru.javarush.island.sawyer.exceptions.IslandGameException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class Prototypes {
    private final Set<Creature> prototypesSet;

    public Prototypes(Class<?>[] classes) {
        this.prototypesSet = preparePrototype(classes);
    }

    private Set<Creature> preparePrototype(Class<?>[] classes) {
        Set<Creature> aSet = new HashSet<>();
        for (Class<?> aClass : classes) {
            try {
                CreatureData className = aClass.getAnnotation(CreatureData.class);
                String nameFromAnnotation = className.name();
                String iconFromAnnotation = className.icon();
                int speedFromAnnotation = className.speed();
                Double weightFromAnnotation = className.weight();
                int maxToSpawnFromAnnotation = className.maxToSpawn();
                Double totalFoodMassFromAnnotation = className.totalFoodWeight();

                Constructor<?> constructor = aClass.getConstructor(
                        String.class, String.class,
                        Double.class, int.class, Double.class, int.class);

                Creature prototype = (Creature) constructor.newInstance(nameFromAnnotation, iconFromAnnotation,
                        weightFromAnnotation, speedFromAnnotation, totalFoodMassFromAnnotation, maxToSpawnFromAnnotation);
                aSet.add(prototype);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                     InvocationTargetException e) {
                throw new IslandGameException(IslandExceptionTypes.CREATE_PROTOTYPE_EXCEPTION, e);
            }
        }
        return aSet;
    }

    public Set<Creature> createFromPrototypes() {
        Set<Creature> creaturesForOneField = new HashSet<>();
        for (Creature aCreature : prototypesSet) {
            if (aCreature instanceof Rabbit ) {
                int maxToSpawn = aCreature.getMaxToSpawn();
                while (maxToSpawn > 0) {
                    Creature clone = aCreature.clone();
                    creaturesForOneField.add(clone);
                    maxToSpawn--;
                }
            }
        }
        return creaturesForOneField;
    }
    //todo продумать создание множества 1 класса Животных из списка прототипов
    // HashMap<Class,Set<1 класс Животных>> map
    // как хранит 1 ячейка множество всех классов животных - Множество{множество Лис, множество Зайцев...)

    @Override
    public String toString() {
        return prototypesSet.toString();
    }
}


