package org.rosu.nosql.entity;

import org.springframework.data.annotation.Id;

public class Person {
    public String getId() {
        return id;
    }

    @Id
    private String id;
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person() {}

    public Person(String header, String surname) {
        this.name = header;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Note[id=%s, name='%s', surname='%s']",
                id, name, surname);
    }
}
