package lesson8.task3;

/*
Демонстрация приоритетов. Создать 2 класса PriorityRunner и PriorityThread.
Запустить 3 потока с приоритетами (min, max, norm). При помощи цикла for выведем на экран значения
 от 1 до 50 и укажем, какой именно поток данную операцию делает.
*/

public class Main extends Thread {

    public static void main(String[] args) {

        Thread main = Thread.currentThread();
        Thread runner = new Thread(new PriorityRunner());
        Thread thread = new Thread(new PriorityThread());

        runner.setPriority(MIN_PRIORITY);
        thread.setPriority(MAX_PRIORITY);

        System.out.println("Priority of runner(" + runner.getName() + ") is: " + runner.getPriority());
        System.out.println("Priority of main(" + main.getName() + ") is: " + main.getPriority());
        System.out.println("Priority of thread(" + thread.getName() + ") is: " + thread.getPriority());

        runner.start();
        thread.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(i + " from " + Thread.currentThread().getName());
        }

    }
}
