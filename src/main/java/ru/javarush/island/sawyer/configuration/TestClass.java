package ru.javarush.island.sawyer.configuration;

import ru.javarush.island.sawyer.entities.creatures.Creature;

import java.util.Set;

public class TestClass {
    private Set<Creature> set;

    public TestClass(Set<Creature> set) {
        this.set = set;
    }

    /*
    [
  {
    "rabbit": {
      "name": "someCreature",
      "icon": "icon"
    }
  },
  {
    "fox": {
      "name": "someCreature",
      "icon": "icon"
    }
  },
  {
    "herb": {
      "name": "someCreature",
      "icon": "icon"
    }
  }
]
     */
}
