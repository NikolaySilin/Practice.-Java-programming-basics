package ru.geekbrains.nikolaysilin.lesson_4;

public class Main {

    public static void main(String[] args) {

        // Создайте 2 переменных типа double с произвольными значениями.
        // Выведите в консоль следующие операции сравнения между ними: >, <, >=, <=, !=, ==

        double da = 5.5;
        double db = 32.99;

        System.out.println("Операция " + da + " > " + db + " = " + (da > db));
        System.out.println("Операция " + da + " < " + db + " = " + (da < db));
        System.out.println("Операция " + da + " >= " + db + " = " + (da >= db));
        System.out.println("Операция " + da + " <= " + db + " = " + (da <= db));
        System.out.println("Операция " + da + " != " + db + " = " + (da != db));
        System.out.println("Операция " + da + " == " + db + " = " + (da == db));

    }
}
