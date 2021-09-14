package ru.gb.java2.lesson3.homework;

import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        IPhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Krylov", "777-77-77");
        phoneBook.add("Ivanov", "555-55-55");
        phoneBook.add("Petrov", "666-66-66");
//        phoneBook.add("Ivanov", "888-88-88");
        phoneBook.add("Ivanov", "777-77-77");

        Set<String> allSurnames = phoneBook.getAllSurnames();
        for (String surname : allSurnames) {
            Set<String> phones = phoneBook.get(surname);
            System.out.printf("%s: %s%n", surname, phones);
        }
    }


}
