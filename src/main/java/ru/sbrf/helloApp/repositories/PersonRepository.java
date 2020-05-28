package ru.sbrf.helloApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sbrf.helloApp.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
