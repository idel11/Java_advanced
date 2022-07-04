package lesson3.task3;

/*Необходимо создать строку с текстом (текст взять любой из интернета).
Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.*/

public class StringHandler {
    public static void main(String[] args) {

        String s = "Any text from internet";
        String[] arr = {
                s.substring(0,(s.length() / 2)),
                s.substring((s.length() / 2))
        };

        for (String s1 : arr) {
            System.out.println(s1);
        }

    }

}
