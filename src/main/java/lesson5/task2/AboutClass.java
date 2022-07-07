package lesson5.task2;

/*
Напишите программу, которая будет выводить всю информацию о классе,
пользователь сам выбирает, какой именно класс интересует.
*/

import java.lang.reflect.Method;
import java.util.*;
import java.lang.*;

public class AboutClass {
    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name(choose one of: String, ArrayList, Method): ");
        String name = sc.next();

        Class<?> cl;
        switch (name) {
            case ("String"):
                cl = String.class;
                break;
            case ("ArrayList"):
                cl = ArrayList.class;
                break;
            case ("Method"):
                cl = Method.class;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }

        System.out.println();
        System.out.println("=========== Info about " + name + " Class ===========");
        System.out.println("Is instance:          " + cl.isInstance(Object.class));
        System.out.println("Is Array:             " + cl.isArray());
        System.out.println("Is primitive:         " + cl.isPrimitive());
        System.out.println("Get interfaces:       " + Arrays.toString(cl.getInterfaces()));
        System.out.println("Get super class:      " + cl.getSuperclass());
        System.out.println("Get modifiers:        " + cl.getModifiers());
        System.out.println("Get component type:   " + cl.getComponentType());
        System.out.println("Get constructors:     " + Arrays.toString(cl.getConstructors()));
        System.out.println("Get fields:           " + Arrays.toString(cl.getFields()));
        System.out.println("Get methods:          " + Arrays.toString(cl.getMethods()));
        System.out.println("Get classes:          " + Arrays.toString(cl.getClasses()));
        System.out.println("Get declared fields:  " + Arrays.toString(cl.getDeclaredFields()));
        System.out.println("Get declared methods: " + Arrays.toString(cl.getDeclaredMethods()));

    }
}
