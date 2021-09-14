package ru.gb.java2.lesson3;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private final String name;
    private final String surname;
    private final int age;

    public Person(String name, int age) {
        this(name, "", age);
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person anotherPerson) {
        return this.name.compareTo(anotherPerson.getName());

//        int compareBySurname = this.surname.compareTo(anotherPerson.getSurname());
//        return compareBySurname != 0 ? compareBySurname : this.getName().compareTo(anotherPerson.getName());
    }
}
