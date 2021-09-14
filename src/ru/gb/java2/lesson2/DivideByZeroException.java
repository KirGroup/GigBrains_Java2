package ru.gb.java2.lesson2;

public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super("Произошло деление на ноль!");
    }
}
