package ru.job4j.loop;

public class Factorial {

    public static int calc(int n) {
        int resalt = 1;
        for (int i = 2; i <= n; i++) {
            resalt = resalt * i;
            if (n == 0) {
                resalt = 1;
            }
        }
        return resalt;
    }
}