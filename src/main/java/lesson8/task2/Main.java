package lesson8.task2;

/*
Задержка потока. Необходимо создать 3 потока, каждых из этих потоков запустить
(например: main, second, first), и когда эти потоки успешно отработают – вывести на экран сообщение
(завершение потом first, second и main).
*/

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
