package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short womenHeight) {
        double rsl = (womenHeight - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        short womenHeight = 152;
        double woman = Fit.womanWeight(womenHeight);
        System.out.println("Woman 152 is " + woman);

    }

}
