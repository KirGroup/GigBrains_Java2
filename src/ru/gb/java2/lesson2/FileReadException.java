package ru.gb.java2.lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadException {

    public static void main(String[] args) {
//        FileInputStream fis = null;
//        try {
        try (FileInputStream fis = new FileInputStream("test_lesson2.txt")) {
//            fis = new FileInputStream("test_lesson21.txt");
            byte[] bytes = fis.readAllBytes();
            String text = new String(bytes);
            System.out.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не был найден!");
        } catch (IOException e) {
            System.out.println("Файл поврежден!");
        }/* finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }

    private static String readTextFromFile(String fileName) throws IOException {
        FileInputStream fis;
        fis = new FileInputStream(fileName);
        byte[] bytes = fis.readAllBytes();
        String text = new String(bytes);
        return text;
    }


}