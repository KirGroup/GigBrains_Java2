package ru.gb.java2.lesson1.part2;

public abstract class Animal {

    private static final String DEFAULT_NAME = "default name";
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this(DEFAULT_NAME);
    }

    public void animalInfo() {
        System.out.println("Animal name is " + name);
    }

    public void jump() {
        System.out.println("Animal jumped");
    }

    public String getName() {
        return name;
    }

    public abstract void voice();

}
