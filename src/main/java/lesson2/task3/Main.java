package lesson2.task3;

import java.util.*;

public class Main {

    public static List<Integer> getIntegerList() {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many integers do you want to add: ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("Enter number(Integer): ");
            list.add(i, sc.nextInt());
        }
        return list;
    }

    public static Integer getMinimum(List<Integer> list) {
        return Collections.min(list);
    }

    public static void main(String[] args) {

        System.out.println("Min value is " + getMinimum(getIntegerList()));

    }
}
