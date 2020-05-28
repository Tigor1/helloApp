package ru.sbrf.helloApp.servicies;

import ru.sbrf.helloApp.entities.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAll();
    Person getPersonById(Long id);
    void putPerson(Person person);
    void deletePersonByID(Long id);
}
