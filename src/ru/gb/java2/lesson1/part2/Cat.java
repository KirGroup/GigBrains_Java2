package ru.gb.java2.lesson1.part2;

public class Cat extends Animal {

    private Color color = Color.RED;
    private CatAttribute catAttribute;

    public static class CatAttribute {
        private String meal;
        private Color colorEyes;
        private int weight;

        public CatAttribute(String meal, Color colorEyes, int weight) {
            this.meal = meal;
            this.colorEyes = colorEyes;
            this.weight = weight;
        }

        public CatAttribute() {
        }

        public int getWeight() {
            return weight;
        }
    }

    public Cat(String name, Color color, CatAttribute catAttribute) {
        super(name);
        this.color = color;
        this.catAttribute = catAttribute;
    }


    public Cat(String name, Color color, String meal, Color colorEyes, int weight) {
        super(name);
        this.color = color;
        this.catAttribute = new CatAttribute(meal, colorEyes, weight);
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void animalInfo() {
        System.out.println("Cat name is " + super.getName() + "; color - " + color +
                "; weight: " + catAttribute.getWeight());
    }

    public CatAttribute getCatAttribute() {
        return catAttribute;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгнул!");
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

}
