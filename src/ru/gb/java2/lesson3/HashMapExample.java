package ru.gb.java2.lesson3;

import java.util.*;

public class HashMapExample {

    public static void main(String args[]) {
//        Map<String, String> hm = new HashMap<>();
//        Map<String, String> hm = new LinkedHashMap<>();
        Map<String, String> hm = new TreeMap<>();

        hm.put("Russia", "Moscow");
//        hm.put("Russia", "Smolensk");
        hm.put("France", "Paris");
        hm.put("Germany", "Berlin");
        hm.put("Norway", "Oslo");

        for (String key : hm.keySet()) {
            String value = hm.get(key);
            System.out.println(key + " - " + value);
        }

//        hm.forEach((key, value) -> {
//            System.out.println(key + ": " + value);
//        });
//
//        for (Map.Entry<String, String> o : hm.entrySet()) {
//            System.out.println(o.getKey() + ": " + o.getValue());
//        }

        Person olegPerson = new Person("Oleg", 27);
        Person alexeyPerson = new Person("Alexey", 29);

        Map<Person, Integer> salaryByWorker = new TreeMap<>();
        salaryByWorker.put(olegPerson, 100_000);
        salaryByWorker.put(alexeyPerson, 150_000);
//
        System.out.println(salaryByWorker.get(olegPerson));
//
        Person copyOlegPerson = new Person("Oleg", 27);
        System.out.println(salaryByWorker.get(copyOlegPerson));
//
//        System.out.println("Alexey salary:" + salaryByWorker.get(new Person("Alexey", 29)));




//
//        hm.put("Germany", "Berlin2");
//        System.out.println("New Germany Entry: " + hm.get("Germany"));
    }

}
