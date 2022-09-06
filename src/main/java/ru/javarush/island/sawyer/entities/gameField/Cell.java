package ru.javarush.island.sawyer.entities.gameField;

public class Cell {
    private final Residents allResidents;

    public Cell(Residents allResidents) {
        this.allResidents = allResidents;
    }

    public Residents getAllResidents() {
        return allResidents;
    }
//todo add: getCell(),getNextCell()

}
