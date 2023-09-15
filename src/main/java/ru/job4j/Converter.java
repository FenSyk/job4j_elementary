package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;

    }

    public static float rubleToDollar(float value) {
        return value / 60;

    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float rsl = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are "  + rsl + " dollars");
    }
}

