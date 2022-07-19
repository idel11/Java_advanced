package lesson8.task2;

public class Main extends Thread {
    public static void main(String[] args) throws InterruptedException {

        System.out.print("finished: ");

        Thread main = new Thread(new Main());
        Thread second = new Thread(new Second());
        Thread first = new Thread(new First());

        main.start();
        second.start();
        first.start();

    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print(" main");
   }
}
