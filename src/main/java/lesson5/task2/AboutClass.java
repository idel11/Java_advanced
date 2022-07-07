package lesson5.task2;

import java.util.*;
import java.lang.*;

public class AboutClass {
    public static void main(String[] args) throws ClassNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String name = sc.next();

        //Class<?> cl = Class.forName(name);
        Class<?> cl = ArrayList.class;

        System.out.println();
        System.out.println("=========== Info about " + name + " Class ===========");
        System.out.println("Is instance:          " + cl.isInstance(Object.class));
        System.out.println("Is Array:             " + cl.isArray());
        System.out.println("Is primitive:         " + cl.isPrimitive());
        System.out.println("Get interfaces:       " + cl.getInterfaces());
        System.out.println("Get super class:      " + cl.getSuperclass());
        System.out.println("Get modifiers:        " + cl.getModifiers());
        System.out.println("Get component type:   " + cl.getComponentType());
        System.out.println("Get constructors:     " + cl.getConstructors());
        System.out.println("Get fields:           " + cl.getFields());
        System.out.println("Get methods:          " + cl.getMethods());
        System.out.println("Get classes:          " + cl.getClasses());
        System.out.println("Get declared fields:  " + cl.getDeclaredFields());
        System.out.println("Get declared methods: " + cl.getDeclaredMethods());

    }
}
