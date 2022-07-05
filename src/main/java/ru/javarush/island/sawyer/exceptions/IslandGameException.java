package ru.javarush.island.sawyer.exceptions;

public class IslandGameException extends RuntimeException {
    private String exceptionTypeName;

    public IslandGameException(IslandExceptionTypes exceptionType, Exception e) {
        super(e);
        this.exceptionTypeName = exceptionType.name();
    }

    public String getExceptionTypeName() {
        return exceptionTypeName;
    }
}
