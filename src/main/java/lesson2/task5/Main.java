package lesson2.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> list = new ArrayList<>();

    public static void print(List list) {
        System.out.println(list);
    }

    public static void main(String[] args) {

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
}
