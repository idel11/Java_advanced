package lesson8.task7;

public class Aclass extends Thread {

    @Override
    public void run(){

        synchronized (Aclass.class){
            System.out.println("Thread1: Holds Aclass");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread1 is waiting Bclass");

            synchronized (Bclass.class){
                System.out.println("Thread1: Holds Aclass and Bclass");
            }
        }
    }
}
