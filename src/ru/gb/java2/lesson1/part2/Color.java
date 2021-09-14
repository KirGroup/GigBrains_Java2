package ru.gb.java2.lesson1.part2;

public enum Color {
//    BLACK,
//    WHITE,
//    RED,
//    GRAY



    WHITE("Белый"), // Color WHITE = new Color("Белый");
    RED("Рыжий"),
    BLACK("Черный"),
    GRAY("Серый");


    private final String russianColor;

    Color(String russianColor) {
        this.russianColor = russianColor;
    }

    public String getRussianColor() {
        return russianColor;
    }

}
