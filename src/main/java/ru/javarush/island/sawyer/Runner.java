package ru.javarush.island.sawyer;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.javarush.island.sawyer.entities.creatures.Person;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

public class Runner implements Serializable {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
//        File file = new File(RATION_PATH);
        File file = new File("src/main/resources/sawyer/person.yml");
        Person person = objectMapper.readValue(file, Person.class);

    }

    /*
    -----
    Вызов всех действий (задач) можно сложить в один класс который extends от Thread, в метод run(), а потом этот класс вызывать в Scheduler'е
    -----
    ListeningExecutorService executorService
    ------
    MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10)
     */
}
