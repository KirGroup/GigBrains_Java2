package ru.gb.java2.lesson1.part2;

public class TestAnimal {

    public static void main(String[] args) {
        for (Color value : Color.values()) {
            System.out.println(value);
            System.out.println(value.getRussianColor());
        }

        System.out.println("-----------");

        System.out.println(Color.valueOf("BLACK"));

        Cat.CatAttribute catAttribute = new Cat.CatAttribute();

        Object cat = new Cat("Бааааааарсик", Color.BLACK, catAttribute);
        Animal cat2 = new Cat("Бааааааарсик2", Color.WHITE, catAttribute);
        Animal  dog = new Dog("Boris", "black", "ovcharka");
//        cat.voice();

        System.out.println(cat instanceof Cat);
        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof String);
        System.out.println(cat instanceof Dog);
    }

    private static void printInfo(Animal animal) {
        animal.animalInfo();
    }

    private static void infoAndJump(Animal animal) {
        animal.animalInfo();
        animal.jump();
//        animal.voice();
        System.out.println();
    }

}
