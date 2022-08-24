package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(4, 4, 4);
        System.out.println("area (4, 4, 4) = " + rsl);
    }
}
