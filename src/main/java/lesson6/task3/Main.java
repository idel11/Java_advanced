package lesson6.task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Transport transport = new Transport();
        Car bmw = new Car();
        Class<?> cl = bmw.getClass();
        System.out.println(Arrays.toString(cl.getAnnotations()));
        transport.canMove();
        bmw.canMove();
        transport.useSteamForMove();

    }
}
