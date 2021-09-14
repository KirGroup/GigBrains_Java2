package ru.gb.java2.lesson1.part1;

public class DocumentEx2/* extends Object*/ {

    String title;
    String content;

    void printInfo() {
        System.out.println(title + System.lineSeparator() + content);
    }

    /* ---------------------------------- */
    public static void main(String[] args) {
        int a = 5;//005['5']

        DocumentEx2 document1 = new DocumentEx2();//001 [112]
        document1.title = "document1";
        document1.content = "Content of document1";

        document1.printInfo();

        DocumentEx2 document2 = new DocumentEx2();//002 [555]
        document2.title = "document2";
        document2.content = "Content of document2";

        document2.printInfo();

        //document1 == document2; //112 == 555
        //document1.equals(document2);
        //document1 = document2;//001[555] and 002[555]
    }

}


