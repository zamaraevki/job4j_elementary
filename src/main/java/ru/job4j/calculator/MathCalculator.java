package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return dif(first, second)
                + div(first, second);
    }

    public static double sumAll(double first, double second) {
        return sumAndMultiply(first, second)
                + difAndDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма и произведение 10 и 20: " + sumAndMultiply(10, 20));
        System.out.println("Вычитание и деление 10 и 20: " + difAndDiv(10, 20));
        System.out.println("Сумма всех 10 и 20: " + sumAll(10, 20));
    }
}
