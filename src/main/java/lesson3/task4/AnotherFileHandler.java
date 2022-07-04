package lesson3.task4;

/*Создайте в package текстовый файл и клас, внесите в файл некий текст.
Выведите на экран содержимое файла.*/

import java.io.*;

public class AnotherFileHandler {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("src/main/java/lesson3/task4/f3.txt");
        int tmp;
        while ((tmp = inputStream.read()) != -1) {
            System.out.print((char) tmp);
        }

    }

}
