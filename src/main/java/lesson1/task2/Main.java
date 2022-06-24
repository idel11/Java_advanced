package lesson1.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Dima");
        names.add("Masha");
        names.add("Luka");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
