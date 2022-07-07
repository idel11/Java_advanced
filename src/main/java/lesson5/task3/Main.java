package lesson5.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> car = Class.forName("lesson5.task3.Car");

        String red = (char) 27 + "[31m";
        String def = (char) 27 + "[39m";

        System.out.println(red + "Fields: ");
        Field[] carFields = car.getDeclaredFields();
        for (Field f : carFields) {
            System.out.println(def + "Name: " + f.getName()
                    + ", type: " + f.getType()
                    + ", annotation_type: " + f.getAnnotatedType());
        }
        System.out.println();

        System.out.println(red + "Methods: ");
        Method[] carMethods = car.getDeclaredMethods();
        for (Method m : carMethods) {
            System.out.println(def + "Name: " + m.getName()
                    + ", return_type: " + m.getReturnType()
                    + ", default_value: " + m.getDefaultValue());
        }
        System.out.println();

        System.out.println(red + "Constructors: ");
        Constructor[] carCons = car.getConstructors();
        for (Constructor c : carCons) {
            System.out.println(def + "Name: " + c.getName()
                    + ", number_of_modifiers: " + c.getModifiers()
                    + ", declaring_class: " + c.getDeclaringClass());
        }
        System.out.println();

        System.out.println(red + "Modifiers: ");
        int carMod = car.getModifiers();
        if (Modifier.isPrivate(carMod)) {
            System.out.println(def + "private ");
        }
        if (Modifier.isAbstract(carMod)) {
            System.out.println(def + "abstract ");
        }
        if (Modifier.isStatic(carMod)) {
            System.out.println(def + "static ");
        }
        if (Modifier.isPublic(carMod)) {
            System.out.println(def + "public ");
        }

    }

}