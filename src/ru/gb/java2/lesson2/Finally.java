package ru.gb.java2.lesson2;

public class Finally {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        b = divideWithFinally(a, b);
        System.out.println(b);

    }

    private static int divideWithFinally(int a, int b) {
        try {
            System.out.println("try");
            return 10 / a;
        } catch (ArithmeticException e) {
            System.out.println("catch");
            return -1;
        } finally {
            System.out.println("Finally");
//            return -10;
//            throw new DivideByZeroException();
        }
    }
}
