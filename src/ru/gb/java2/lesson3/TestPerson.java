package ru.gb.java2.lesson3;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestPerson {

    public static void main(String[] args) {
//        Map<Person, Integer> salaryByWorker = new TreeMap<>(Comparator.comparing(Person::getAge));
        Map<Person, Integer> salaryByWorker = new TreeMap<>();
        Person oleg   = new Person("Oleg", 27);
        Person alexey = new Person("Alexey", 29);

        salaryByWorker.put(oleg, 100_000);
        salaryByWorker.put(alexey, 150_000);

        for (Person person : salaryByWorker.keySet()) {
            Integer salary = salaryByWorker.get(person);
            System.out.println("Person " + person.getName() + ": " + salary);
        }
    }
}
