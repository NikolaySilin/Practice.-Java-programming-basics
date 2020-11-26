package ru.geekbrains.nikolaysilin.lesson_3;

public class Main {

    public static void main(String[] args) {

// Создайте две переменных типа double и присвойте им какие-нибудь значения.
// Выполните с ними операции сложения, вычитания, умножения и деления.
// Выполните операцию инкремента и декремента надо одной из переменных.
// Выведите результат в консоль.

        double da = 5.4;
        double db = 62.47;
        double result = da + db;
        System.out.println("Результат сложения " + result);
        result = da - db;
        System.out.println("Результат вычитания " + result);
        result = da * db;
        System.out.println("Результат умножения " + result);
        result = da / db;
        System.out.println("Результат деления " + result);
        da++;
        System.out.println("Инкремент " + da);
        db--;
        System.out.println("Декремент " + db);

// Прибавьте к первой переменной 5 и запишите результат в эту же переменную (полнойзаписью и сокращённой).
// Выведите результат в консоль.

        da = da + 5;
        da += 5;
        System.out.println("\nРезультат сложения первой переменной " + da);

// Создайте целую переменную и присвойте ей значение 8.
// Выведите остаток от деления на 3 в консоль

        int ic = 8 % 3;
        System.out.println("\nРезультат деления с остатком: " + ic);



    }
}
