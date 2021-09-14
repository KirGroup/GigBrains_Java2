package ru.gb.java2.lesson3.list;

import java.util.*;
import java.util.function.Function;

public class ArrayListExample {

    public static void main(String[] args) {
//        arrayExample();
        arrayListExample();
    }

    private static void arrayExample() {
//        Integer[] arr = new Integer[4];//+5
        int[] arr = {1, 2, 3, 4}; // [0; arr.length)
//        arr[4] = 5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        int[] arrNew = new int[10];
//        System.arraycopy(arr, 0, arrNew, 0, arr.length);
        int[] arrNew = Arrays.copyOf(arr, 10);
        arr = arrNew;
        arr[4] = 5;
//        System.out.println(arrNew);
        System.out.println(Arrays.toString(arr));
    }

    private static void arrayListExample() {
        String[] arr = {"1", "2", "3", "4"};
        List<String> list = Arrays.asList(arr);
        List<String> newDataName = new ArrayList<>(5);
        newDataName.add("B");
        newDataName.add("A");
        newDataName.add("C");
        newDataName.add("E");
        newDataName.add("D");
        newDataName.add("E");
        newDataName.add("E");
        newDataName.sort(null);
//        newDataName.sort(Comparator.comparing(String::toLowerCase));
        System.out.println(newDataName);
        System.out.println(newDataName.get(1));
//        newDataName.add(1, "А0");
//        System.out.println(newDataName);
//        boolean result = true;
//        while (result) {
//            result = newDataName.remove("E");
//        }
        newDataName.remove("E");
        newDataName.remove(2);
//        System.out.println(newDataName);
        System.out.println("contains C? " + newDataName.contains("C"));
        System.out.println("contains D? " + newDataName.contains("D"));

        for (int i = 0; i < newDataName.size(); i++) {
            System.out.println(newDataName.get(i));//newDataName[i]
        }

        for (String s : newDataName) {
            System.out.println(s);
        }
//
//

        System.out.println("----");

//        ArrayList<String> strings = new ArrayList<>(newDataName);
//        for (String next : strings) {
//            System.out.print(next);
//            strings.remove(next);
//        }

//        newDataName.stream()
//                .map(s -> s + "-end")
//                .filter(s -> s.startsWith("E"))
//                .reduce(String::concat)
//                .ifPresentOrElse(System.out::println, () -> System.out.println("empty"));


        Iterator<String> iterator = newDataName.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            iterator.remove();
        }

        System.out.println();
        System.out.println("Is empty?: " + newDataName);
    }

}
