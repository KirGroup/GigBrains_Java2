package ru.gb.java2.lesson2.homework;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String cellValue, int rowIndex, int colIndex) {
        super(String.format("Invalid value '%s' in array cell[%d][%d], required integer",
                cellValue, rowIndex, colIndex));
    }

}
