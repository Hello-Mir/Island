package ru.javarush.island.sawyer.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import ru.javarush.island.sawyer.abstractions.CreatureData;
import ru.javarush.island.sawyer.configuration.CreatureModels;
import ru.javarush.island.sawyer.configuration.Properties;
import ru.javarush.island.sawyer.entities.creatures.Creature;
import ru.javarush.island.sawyer.exceptions.IslandExceptionTypes;
import ru.javarush.island.sawyer.exceptions.IslandGameException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class Prototypes {
    private final Set<Creature> prototypesSet;

    public Prototypes(Class<?>[] classes, String nameParam, String iconParam) {
        this.prototypesSet = preparePrototype(classes, nameParam, iconParam);
    }

    private Set<Creature> preparePrototype(Class<?>[] classes, String nameParam, String iconParam) {
        Set<Creature> aSet = new HashSet<>();
        for (Class<?> aClass : classes) {
            try {
                Constructor<?> constructor = aClass.getConstructor(String.class, String.class);
                CreatureData className = aClass.getAnnotation(CreatureData.class);
                String nameFromAnnotation = className.name();
                String iconFromAnnotation = className.icon();
                Creature prototype = (Creature) constructor.newInstance(nameFromAnnotation, iconFromAnnotation);
                aSet.add(prototype);
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
                     InvocationTargetException e) {
                throw new IslandGameException(IslandExceptionTypes.CREATE_PROTOTYPE_EXCEPTION, e);
            }
        }
        return aSet;
    }

    public CreatureModels initPropertyValues() {
        Gson gson = new Gson();
        return gson.fromJson(Properties.CONFIG_PATH, CreatureModels.class);
    }

    @Override
    public String toString() {
        return prototypesSet.toString();
    }
}


