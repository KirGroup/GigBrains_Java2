package ru.gb.java2.lesson2;

public class AutoClosableError implements AutoCloseable {
    @Override
    public void close() {
//        System.out.println("Test!");
        throw new RuntimeException("Test!");
    }

    public static void main(String[] args) {
        try (AutoClosableError ace = new AutoClosableError()) {
            System.out.println("try!");
        } catch (Exception e) {
            System.out.println("catch!");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
