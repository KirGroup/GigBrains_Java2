package ru.gb.java2.lesson1.part3;


import ru.gb.java2.lesson1.part2.Animal;

public class CatV2 extends Animal implements Pet {

    private final String color;

    public CatV2(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Cat name is " + super.getName() + "; color - " + color);
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    @Override
    public void loveMaster() {
        System.out.println("Мур");
    }

    @Override
    public boolean isUseful() {
        return false;
    }
}
