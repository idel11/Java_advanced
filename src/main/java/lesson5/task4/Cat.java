package lesson5.task4;

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
