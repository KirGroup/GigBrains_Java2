package ru.gb.java2.lesson4.app.example.repository.impl;


import ru.gb.java2.lesson4.app.example.model.Person;
import ru.gb.java2.lesson4.app.example.repository.PersonRepository;

import java.util.List;

public class TestPersonRepository implements PersonRepository {
    @Override
    public List<Person> getAllData() {
        return List.of(
                new Person("Hans", "Muster"),
                new Person("Ruth", "Mueller"),
                new Person("Heinz", "Kurz"),
                new Person("Cornelia", "Meier"),
                new Person("Werner", "Meyer"),
                new Person("Lydia", "Kunz"),
                new Person("Anna", "Best"),
                new Person("Stefan", "Meier"),
                new Person("Martin", "Mueller")
        );
    }
}
