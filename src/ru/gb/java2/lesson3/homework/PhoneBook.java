package ru.gb.java2.lesson3.homework;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;

public class PhoneBook implements IPhoneBook {

    private final Map<String, Set<String>> phonesBySurname /*= new TreeMap<>()*/;

    public PhoneBook() {
        phonesBySurname = new TreeMap<>();
    }

    @Override
    public void add(String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }

    private Set<String> getPhones(String surname) {
//        Set<String> phones = phonesBySurname.getOrDefault(surname, new HashSet<>());
//        if (phones.isEmpty()) {
//            phonesBySurname.put(surname, phones);
//        }
//
//        return phones;

//        return phonesBySurname.computeIfAbsent(surname, new Function<String, Set<String>>() {
//            @Override
//            public Set<String> apply(String key) {
//                return new HashSet<>();
//            }
//        });

        return phonesBySurname.computeIfAbsent(surname, key -> new HashSet<>());
    }

    @Override
    public Set<String> get(String surname) {
        return getPhones(surname);
    }

    @Override
    public Set<String> getAllSurnames() {
        return phonesBySurname.keySet();
    }
}
