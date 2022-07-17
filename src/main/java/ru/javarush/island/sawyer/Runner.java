package ru.javarush.island.sawyer;

import com.google.gson.Gson;
import ru.javarush.island.sawyer.configuration.CreatureModels;
import ru.javarush.island.sawyer.configuration.Properties;
import ru.javarush.island.sawyer.services.ClassFinder;
import ru.javarush.island.sawyer.services.Prototypes;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
        ClassFinder classFinder = new ClassFinder();
        Class<?>[] setOfClasses = classFinder.collectClassesFromPackage(Properties.CREATURE_PACKAGE_PATH);
        Prototypes prototypes = new Prototypes(setOfClasses);
        Gson gson = new Gson();
        try (FileReader fileReader = new FileReader(Properties.CONFIG_PATH)) {
            CreatureModels creatureModels = gson.fromJson(fileReader, CreatureModels.class);
            System.out.println(creatureModels);
        }

        // todo оформить readme
    }
    /*
    размножить животных до нужного числа:
        1) реализовать Cloneable()
        2) переопределить clone()

     */

    /*
    -----
    Вызов всех действий (задач) можно сложить в один класс который extends от Thread, в метод run(), а потом этот класс вызывать в Scheduler'е
    -----
    ListeningExecutorService executorService
    ------
    MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10)
     */
}
