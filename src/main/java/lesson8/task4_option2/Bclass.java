package lesson8.task4_option2;

public class Bclass extends Thread {

    private int id;

    public void one() throws InterruptedException {
        System.out.println("One form B class");
        Thread.sleep(1100);
    }

    public void two() throws InterruptedException {
        System.out.println("Two form B class");
        Thread.sleep(1100);
    }

    public void three() throws InterruptedException {
        System.out.println("Three form B class");
        Thread.sleep(1100);
    }

    @Override
    public void run() {
        try {
            one();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            two();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            three();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

