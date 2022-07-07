package lesson5.task4;

/*
Создайте 2 класса, Animal и Cat. В классе Animal инициализируйте 3 поля различных модификаторов.
В классе Cat используя рефлексию получите доступ к полям класса Animal
и измените содержимое каждого из полей.
*/


import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        String red = (char) 27 + "[31m";
        String def = (char) 27 + "[39m";

        Class<Animal> animalClass = Animal.class;
        Animal dog = new Animal(4, "dog", true);
        System.out.println();
        System.out.println(red + "========== Original ==========" + def);
        System.out.print("Legs: " + dog.getLegs() + " ");
        System.out.print("Kind: " + dog.getKind() + " ");
        System.out.print("Is predator: " + dog.getPredator() + " ");
        System.out.println();
        System.out.println();

        Field legsF = animalClass.getDeclaredField("legs");
        legsF.setAccessible(true);
        legsF.setInt(dog, 5);

        Field kindF = animalClass.getDeclaredField("kind");
        kindF.set(dog, "horse");

        Field predF = animalClass.getDeclaredField("isPredator");
        predF.setBoolean(dog, false);

        System.out.println(red + "========== Modified with reflection ==========" + def);
        System.out.print("Legs: " + dog.getLegs() + " ");
        System.out.print("Kind: " + dog.getKind() + " ");
        System.out.print("Is predator: " + dog.getPredator() + " ");
        System.out.println();

    }
}
