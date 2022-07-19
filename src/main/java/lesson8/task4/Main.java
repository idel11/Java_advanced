package lesson8.task4;

public class Main {
    public static void main(String[] args) {

        Thread a = new Thread(new Aclass(new Bclass()));

        a.start();

    }
}
