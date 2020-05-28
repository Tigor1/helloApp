package ru.sbrf.helloApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.sbrf.helloApp.entities.Person;
import ru.sbrf.helloApp.servicies.PersonService;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    private PersonService personService;

    @GetMapping("/hello")
    public String greering(@RequestParam(defaultValue = "world") String name) {
        return String.format("Hello, %s", name);
    }

    @GetMapping("/persons")
    public List<Person> getPersons() {
        List<Person> list = personService.getAll();
        list.forEach(System.out::println);

        return personService.getAll();
    }

    @GetMapping("/persons/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/persons")
    public String putPerson(@RequestBody Person person) {
        personService.putPerson(person);
        return "added";
    }

    @DeleteMapping("/persons/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePersonByID(id);
    }
}
