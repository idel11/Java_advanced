package lesson2.task2;

import java.util.*;

public class Main {

    private static LinkedList<String> words = new LinkedList<>();
    public static LinkedList<String> fillLinked(LinkedList<String> words){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter word #" + i + " : ");
            String s = sc.nextLine();
            words.addLast(s);
        } return words;
    }

    public static LinkedList<String> doubleValues(LinkedList<String> words){
        int temp = ((words.size() * 2) - 1);
        for (int i = 0; i < temp; i++) {
            words.add((i + 1), words.get(i));
            i++;
        } return words;
    }

    public static void printLinked(LinkedList<String> words){
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }

    public static void main(String[] args) {

        fillLinked(words);

        doubleValues(words);

        printLinked(words);

    }
}
