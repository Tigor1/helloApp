package ru.sbrf.helloApp.exceptions;

public class PersonNotFoundException extends RuntimeException{
    public PersonNotFoundException(Long id) {
        super("Could not person " + id);
    }
}
