package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(3, 7));
        System.out.println(sum(4, 12));
        System.out.println(sum(0, 100));

        System.out.println(sumByEven(0, 6));
        System.out.println(sumByEven(3, 19));
        System.out.println(sumByEven(1, 1));
    }
}
