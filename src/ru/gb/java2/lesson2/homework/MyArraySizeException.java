package ru.gb.java2.lesson2.homework;

public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException() {
        super("Invalid array size, required 4x4");
    }
}
