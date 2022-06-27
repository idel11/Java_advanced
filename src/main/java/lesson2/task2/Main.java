package lesson2.task2;

import java.util.*;

public class Main {

    private static List<String> words = new LinkedList<>();

    public static List<String> fill(List<String> words) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter word #" + i + " : ");
            String s = sc.nextLine();
            words.add(s);
        }
        return words;
    }

    public static List<String> doubleValues(List<String> words) {
        int temp = ((words.size() * 2) - 1);
        for (int i = 0; i < temp; i++) {
            words.add((i + 1), words.get(i));
            i++;
        }
        return words;
    }

    public static void print(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }

    public static void main(String[] args) {

        fill(words);

        doubleValues(words);

        print(words);

    }
}
