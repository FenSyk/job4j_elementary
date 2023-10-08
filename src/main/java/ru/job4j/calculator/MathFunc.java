package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        return x * x + 1;

    }

    public static int func3(int x) {
        return x * 2;
    }

    public static int func2(int x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        int result3 = MathFunc.func1(100);
        int result2 = MathFunc.func3(5);
        int total = result3 + result2;
        System.out.println(total);
    }
}
