package lesson8.task4_option2;

public class Aclass extends Thread {


    public void one() throws InterruptedException {
        System.out.println("One form A class");
       Thread.sleep(1000);
    }

    public void two() throws InterruptedException {
        System.out.println("Two form A class");
        Thread.sleep(1000);
    }

    public void three() throws InterruptedException {
        System.out.println("Three form A class");
        Thread.sleep(1000);
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
