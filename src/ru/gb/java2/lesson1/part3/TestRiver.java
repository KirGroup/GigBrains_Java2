package ru.gb.java2.lesson1.part3;

public class TestRiver {

    public static void main(String[] args) {
        River river = new River("Volga", 100);



        Duck duck = new Duck("duck");
        DogV2 dog = new DogV2("Sharik", "Black", "Ovcharka");
        CatV2 cat = new CatV2("Sharik", "Black");
//        System.out.println(river.doSwim(duck));
//        System.out.println(river.doSwim(dog));

        Waterfowl[] waterfowls = {duck, dog};
//        swim(river, waterfowls);
        swim(river, duck, dog);
    }

    //    private static void swim(River river, Waterfowl[] waterfowls) {
    private static void swim(River river, Waterfowl... waterfowls) {
        for (Waterfowl waterfowl : waterfowls) {
            System.out.println(waterfowl);
            System.out.println(river.doSwim(waterfowl));
        }
    }
}
