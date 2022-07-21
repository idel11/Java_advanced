package lesson8.task4_option2;

/*
Создать 2 произвольных класса с полями и методами. Необходимо синхронизировать методы этих классов
между собой, т.е. чтобы выводило на экран значения друг за другом (1 класс, 2 класс, 1, 2 и т.д.).
*/

public class Main {
    public static void main(String[] args) {

        Thread a = new Aclass();
        Thread b = new Bclass();

        a.start();
        b.start();

    }
}
