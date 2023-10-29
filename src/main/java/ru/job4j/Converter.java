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
        System.out.println("120 rubles are " + rsl + " dollars");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float in2 = 120;
        float expected2 = 2;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2. Test result : " + passed2);

    }
}

