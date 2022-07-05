package ru.javarush.island.sawyer.services;

import org.reflections.Reflections;
import ru.javarush.island.sawyer.abstractions.CreatureData;

import java.util.ArrayList;
import java.util.Set;

public class ClassFinder {
    public Class<?>[] collectClassesFromPackage(String packageName) {
        Reflections reflections = new Reflections(packageName);
        Set<Class<?>> typesAnnotatedWith = reflections.getTypesAnnotatedWith(CreatureData.class);
        Class<?>[] classArray = new Class[typesAnnotatedWith.size()];
        ArrayList<Class<?>> classes = new ArrayList<>();
        typesAnnotatedWith.parallelStream().forEach((clazz) -> {
            classes.add(clazz);
        });
        classes.toArray(classArray);
        return classArray;
    }
}
