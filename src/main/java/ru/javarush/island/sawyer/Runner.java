package ru.javarush.island.sawyer;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import ru.javarush.island.sawyer.configuration.CreatureModels;
import ru.javarush.island.sawyer.configuration.Properties;
import ru.javarush.island.sawyer.entities.creatures.animals.herbivores.Rabbit;
import ru.javarush.island.sawyer.entities.creatures.animals.predators.Fox;
import ru.javarush.island.sawyer.entities.creatures.plants.Herb;
import ru.javarush.island.sawyer.services.ClassFinder;
import ru.javarush.island.sawyer.services.Prototypes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
        ClassFinder classFinder = new ClassFinder();
        Class<?>[] setOfClasses = classFinder.collectClassesFromPackage(Properties.CREATURE_PACKAGE_PATH);
        Prototypes prototypes = new Prototypes(setOfClasses, "voidName", "voidIcon");
//        System.out.println(prototypes);
//
//        CreatureModels creatureModels = prototypes.initPropertyValues();
//        System.out.println(creatureModels);

        // ==========================================
//        CreatureModels creatureModels1 = new CreatureModels(
//                new Rabbit("заяц", "иконка зайца"),
//                new Fox("лиса", "иконка лисы"),
//                boar, bear, deer, duck, goat, new Herb("трава", "иконка травы"),
//                wolf, eagle, horse, mouse, snake, sheep, buffalo, caterpillar);
//            Gson gson = new Gson();
//        try (FileWriter fileWriter = new FileWriter("src/main/resources/sawyer/properties.json")) {
//            JsonWriter jsonWriter = new JsonWriter(fileWriter);
//            gson.toJson(creatureModels1, fileWriter);
//        }
        Gson gson = new Gson();
        try (FileReader fileReader = new FileReader(Properties.CONFIG_PATH)) {
            CreatureModels creatureModels = gson.fromJson(fileReader, CreatureModels.class);
            System.out.println(creatureModels);
        }

        // ===================================
        // todo оформить readme
        // jackson/github
    }
    /*
    собери все классы
    создай на основе них животных = существ
    создай json модель
         пропиши значения животным
    получи прототип животного
    размножь до нужного числа
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
