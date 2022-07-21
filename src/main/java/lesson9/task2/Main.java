package lesson9.task2;

/*
Создать список и заполнить рандомными числами 10 ячеек,
нужно вывести сумму квадратов всех элемента списка.
Мы используем метод map() для возведения в квадрат каждого элемента,
а потом применяем метод reduce() для свертки всех элементов в одно число.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }

        System.out.println(list);

        /*int result = list.stream() // this option is more preferable as for me
                .mapToInt(e -> e*e)
                .sum();*/

        Optional<Integer> result = list.stream()
                .map(e -> e * e)
                .reduce(Integer::sum);

        System.out.println(result);

    }
}
