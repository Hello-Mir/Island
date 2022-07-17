package ru.javarush.island.sawyer.exceptions;

public class IslandGameException extends RuntimeException {
    private final IslandExceptionTypes exceptionTypes;

    public IslandGameException(IslandExceptionTypes exceptionType, Exception e) {
        super(e);
        this.exceptionTypes = exceptionType;
    }

    @Override
    public String toString() {
        return "IslandGameException{" +
                "exceptionCode=" + exceptionTypes.getCode() +
                '}';
    }
}
