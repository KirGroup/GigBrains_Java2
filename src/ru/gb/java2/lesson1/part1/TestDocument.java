package ru.gb.java2.lesson1.part1;

public class TestDocument {

    public static void main(String[] args) {
        Document document1 = new Document("test1", "content1");
        System.out.println(document1);
        System.out.println(Document.DEFAULT_TITLE);
    }
}
