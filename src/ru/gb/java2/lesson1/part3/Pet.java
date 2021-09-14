package ru.gb.java2.lesson1.part3;

public interface /*abstract class*/ Pet {

    String TITLE = "tewt";

    void loveMaster();

    default boolean isUseful() {
        return false;
    };
}
