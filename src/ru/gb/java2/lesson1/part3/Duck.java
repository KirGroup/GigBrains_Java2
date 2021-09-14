package ru.gb.java2.lesson1.part3;

import ru.gb.java2.lesson1.part2.Animal;

public class Duck extends Animal implements Pet, Waterfowl {

    public static final int SWIM_LENGTH = 150;

    public Duck(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Кря!");
    }

    @Override
    public void loveMaster() {
        System.out.println("Кря кря кря хозяин!");
    }

    @Override
    public boolean isUseful() {
        return true;
    }

    @Override
    public int swim() {
        System.out.println("Утка плывет");
        return SWIM_LENGTH;
    }

    @Override
    public String toString() {
        return "Duck{}";
    }
}
