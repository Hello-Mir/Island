package ru.javarush.island.sawyer.entities.gameField;

import java.util.List;

public class GameField {
    private final Cell[][] cells;

    public GameField(int rows, int colons) {
        this.cells = new Cell[rows][colons];
    }

    public List<Residents> getAllResidents() {
        List<Residents> list = null;
        for (Cell[] cellArray : cells) {
            for (Cell oneCell : cellArray) {
                list.add(oneCell.getAllResidents());
            }

        }
        return list;
    }
    //todo: toString?
}
