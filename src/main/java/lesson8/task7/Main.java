package lesson8.task7;

/*
Изменить задание №6. Всеми возможными способами (которые Вы знаете) решить проблему взаимной блокировки.
*/


public class Main {
    public static void main(String[] args) {

        Aclass a = new Aclass();
        Bclass b = new Bclass();

        a.start();
        b.start();

    }
}
