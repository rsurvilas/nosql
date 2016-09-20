package org.rosu.nosql.repository;


import org.rosu.nosql.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {
    /**
     * Finds a Person by name.
     *
     * @param name - name to search.
     *
     * @return Person that is found by given name.
     */
    Person findByName(String name);

    /**
     * Finds a list of Notes by similar text.
     *
     * @param surname - surname to search.
     *
     * @return A list of Persons that are found by given surname.
     */
    List<Person> findBySurname(String surname);


}
