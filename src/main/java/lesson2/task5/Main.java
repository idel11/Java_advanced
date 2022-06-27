package lesson2.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> list = new ArrayList<>();

    public static void print(List list) {
        System.out.println("Your list is:");
        for (Object s : list) {
            System.out.println(s);
        }
    }

    public static void fillList() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter string: ");
            String temp = sc.nextLine();
            if (temp.equals("end")) {
                print(list);
                break;
            } else list.add(temp);
        }
    }

    public static void main(String[] args) {

        fillList();

    }
}
