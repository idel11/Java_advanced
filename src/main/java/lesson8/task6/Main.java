package lesson8.task6;

/*
Создать 2 класса. Реализовать взаимную блокировку(deadlock) этих классов.
*/

public class Main {
    public static void main(String[] args) {

        Aclass a = new Aclass();
        Bclass b = new Bclass();

        a.start();
        b.start();

    }
}
