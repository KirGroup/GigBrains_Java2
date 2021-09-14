package ru.gb.java2.lesson3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtils {

    public static void main(String[] args) {
        Integer[] d = {1, 3, 5, 4, 2};
        List<Integer> data = Arrays.asList(d);
        Collections.reverse(data);
        System.out.println("Reverse:");
        System.out.println(data);
        System.out.println();

        List<Object> emptyList = Collections.emptyList();
        System.out.println("Empty List:");
        System.out.println(emptyList);
        System.out.println();

        List<Object> singletonList = Collections.singletonList(1);
        System.out.println("Singleton List:");
        System.out.println(singletonList);
        System.out.println();

        Collections.sort(data);
        System.out.println("Sort:");
        System.out.println(data);
        System.out.println();

        List<Integer> fillData = Arrays.asList(1, 2, 3, 4, 5);
        Collections.fill(fillData, 2);
        System.out.println("Fill:");
        System.out.println(fillData);
        System.out.println();

        List<Integer> data2 = List.of(1, 2, 2, 2, 3, 4, 5, 2, 6);
        System.out.println("data: " + data2);
        System.out.println("Frequency for 2:");
        int frequency = Collections.frequency(data2, 2);
        System.out.println(frequency);
        System.out.println("Min: " + Collections.min(data2));
        System.out.println("Max: " + Collections.max(data2));

        System.out.println("nCopies:");
        List<String> helloCopies = Collections.nCopies(5, "hello");
        System.out.println(helloCopies);
        System.out.println();

        System.out.println("data: " + data);
        System.out.println("Shuffle:");
        Collections.shuffle(data);
        System.out.println(data);
    }
}
