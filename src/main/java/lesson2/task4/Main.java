package lesson2.task4;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String, String> map = new HashMap<>();

    public static HashMap<String, String> fillMap() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter city: ");
            String k = sc.nextLine();
            System.out.print("Enter family: ");
            String v = sc.nextLine();
            map.put(k, v);
        }
        return map;
    }

    public static void findByCity(HashMap map) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter city for search family: ");
        String k = sc.nextLine();
        System.out.println("The family is: " + map.get(k));
    }

    public static void main(String[] args) {

        findByCity(fillMap());

    }
}
