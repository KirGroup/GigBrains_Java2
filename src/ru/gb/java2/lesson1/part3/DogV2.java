package ru.gb.java2.lesson1.part3;


import ru.gb.java2.lesson1.part2.Animal;

public class DogV2 extends Animal implements Pet, Waterfowl {

    private final String color;
    private final String type;

    public DogV2(String name, String color, String type) {
        super(name);
        this.color = color;
        this.type = type;
    }

    @Override
    public void animalInfo() {
        System.out.println("Dos name is " + super.getName() + "; color - " + color + "; type - " + type);
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

    @Override
    public void loveMaster() {
        System.out.println("Гав гав гав!");
    }

    @Override
    public boolean isUseful() {
        return true;
    }

    @Override
    public int swim() {
        System.out.println("Плыву по-собачьи!");
        return DEFAULT_SWIM_LENGTH;
    }

    @Override
    public String toString() {
        return "DogV2{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
