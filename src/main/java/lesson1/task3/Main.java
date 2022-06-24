package lesson1.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(1,300, 8000, "BMW", "A");
        Car c2 = new Car(2,300, 8000, "BMW", "B");
        Car c3 = new Car(3,400, 8000, "BMW", "B");
        Car c4 = new Car(4,400, 8000, "CBMW", "B");
        Car c5 = new Car(5,500, 8000, "BMW", "B");
        Car c6 = new Car(6,500, 8100, "BMW", "B");
        Car c7 = new Car(7,500, 8100, "BMW", "B");
        Car c8 = new Car(8,510, 8100, "BMW", "B");

        Car[] c = {c6, c5, c4, c1, c2, c8, c7, c3};

        for (Car temp : c) {
            System.out.println(temp);
        }
        System.out.println("=================== SORTED =====================");
        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
