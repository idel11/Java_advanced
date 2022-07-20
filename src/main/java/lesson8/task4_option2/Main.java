package lesson8.task4_option2;

public class Main {
    public static void main(String[] args) {

        Thread a = new Aclass();
        Thread b = new Bclass();

        a.start();
        b.start();

    }
}
