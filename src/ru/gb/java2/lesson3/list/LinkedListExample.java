package ru.gb.java2.lesson3.list;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("Е");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");
        System.out.println(linkedList);

        linkedList.add(1, "А2");
        System.out.println("1. linkedList: " + linkedList);

        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("2. linkedList: " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.sort(null);
        System.out.println("3. linkedList: " + linkedList);

//        String val = linkedList.get(2);
//        linkedList.set(2, val + " изменено");
//        System.out.println("4. linkedList: " + linkedList);

//        new ArrayList<>(linkedList);
//
//
//        new LinkedList<>(new ArrayList<>());
//        new LinkedList<>().addAll(new ArrayList<>());
    }

}
