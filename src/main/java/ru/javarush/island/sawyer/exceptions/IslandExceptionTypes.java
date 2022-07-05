package ru.javarush.island.sawyer.exceptions;

public enum IslandExceptionTypes {
    CREATE_PROTOTYPE_EXCEPTION(10,"Не удалось создать прототипы");
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    IslandExceptionTypes(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
