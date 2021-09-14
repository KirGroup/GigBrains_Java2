package ru.gb.java2.lesson1.part1;

public class DocumentEx4 extends Object {

    private static final String DEFAULT_TITLE = "Unknown";

    private String title;
    private String content;

    public DocumentEx4(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public DocumentEx4(String content) {
//        this.content = content;
//        this.title = "Unknown";
        this(DEFAULT_TITLE, content);
    }

    void printInfo() {
        System.out.println(this.title + System.lineSeparator() + content);
    }




    /* ---------------------------------- */
    public static void main(String[] args) {
        DocumentEx4 document1 = new DocumentEx4("document1", "Content of document1");
        document1.printInfo();

        DocumentEx4 document2 = new DocumentEx4("Content of document2");
        document2.printInfo();
    }
}


