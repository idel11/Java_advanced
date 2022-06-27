package lesson2.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Collection<String> words = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five words separated by space: ");
        String s  = sc.nextLine();
        words = List.of(s.split(" "));

        System.out.println(words);




    }
}
