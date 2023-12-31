package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 6, 2, 8);
        System.out.println("result (4, 6) to (2, 8) " + result);
        double result2 = Point.distance(2, 3, 5, 9);
        System.out.println("result (2, 3) to (5, 9) " + result2);
    }
}
