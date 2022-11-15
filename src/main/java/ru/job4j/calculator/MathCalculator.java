package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDifAndDiv(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumFourOperation(double first, double second) {
        return sum(first, second) + multiply(first, second) + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сумма суммы и произведения: " + sumAndMultiply(10, 20));
        System.out.println("Результат сумма разности и деления: " + sumDifAndDiv(10, 20));
        System.out.println("Результат сумма всех четырех операций: " + sumFourOperation(10, 20));
    }
}
