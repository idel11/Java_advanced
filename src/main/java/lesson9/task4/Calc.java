package lesson9.task4;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        Arithmetic add = (a, b) -> a + b;
        Arithmetic sub = (a, b) -> a - b;
        Arithmetic mul = (a, b) -> a * b;
        Arithmetic div = (a, b) -> a / b;

        System.out.print("Enter two integers divided by space: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);

        System.out.println("resultAdd = " + add.action(x, y));
        System.out.println("resultSub = " + sub.action(x, y));
        System.out.println("resultMul = " + mul.action(x, y));
        if (y == 0) {
            System.err.println("No division by 0");
        } else System.out.println("resultDiv = " + div.action(x, y));

    }
}
