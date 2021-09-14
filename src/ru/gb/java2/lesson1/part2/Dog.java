package ru.gb.java2.lesson1.part2;

public class Dog extends Animal {

    private final String color;
    private final String type;

    public Dog(String name, String color, String type) {
        super(name);
        this.color = color;
        this.type = type;
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Dog name is " + super.getName() + "; color - " + color + "; type - " + type);
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

}
