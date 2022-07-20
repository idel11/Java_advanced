package lesson8.task7;

public class Bclass extends Thread{

    @Override
    public void run(){

            System.out.println("Thread2: Holds Bclass");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread2 is waiting Aclass");


                System.out.println("Thread2: Holds Aclass and Bclass");
        }
}
