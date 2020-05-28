package ru.sbrf.helloApp.servicies.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sbrf.helloApp.entities.Person;
import ru.sbrf.helloApp.exceptions.PersonNotFoundException;
import ru.sbrf.helloApp.repositories.PersonRepository;
import ru.sbrf.helloApp.servicies.PersonService;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImp(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public void putPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElseThrow(()->new PersonNotFoundException(id));
    }

    @Override
    public void deletePersonByID(Long id) {
        personRepository.deleteById(id);
    }
}
