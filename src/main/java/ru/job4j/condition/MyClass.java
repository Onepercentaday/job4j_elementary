package ru.job4j.condition;

public class MyClass {

    public static String answer(String question) {
        String result = "Не знаю что сказать";
        if ("Привет Сева".equals(question)) {
            result = "Привет Аня";
        } else if ("Как дела".equals(question)) {
            result = "Все нормально, как ваши?";
        }
        return result;
    }

    public static void main(String[] args) {
        String rsl = MyClass.answer("Привет Сева");
        System.out.println(rsl);
        rsl = MyClass.answer("Как дела");
        System.out.println(rsl);
        rsl = MyClass.answer("Блабла");
        System.out.println(rsl);

    }
}
