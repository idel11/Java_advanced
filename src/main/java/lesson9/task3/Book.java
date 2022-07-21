package lesson9.task3;

/*
Создать класс Book, сделать 3 поля и соответствующие методы.
Необходимо реализовать замыкание анонимного класса и лямбда-выражения
*/

public class Book {

    public static void main(String[] args) {

        int numberOfPages = 224;
        String Author = "Shevchenko";
        String name = "Kobzar";

        Display printAuthor = () -> System.out.println("Author = " + Author);

        Display printName = () -> System.out.println("name = " + name);

        Display printPages = () -> System.out.println("numberOfPages = " + numberOfPages);

        printAuthor.print();
        printName.print();
        printPages.print();

    }
}
