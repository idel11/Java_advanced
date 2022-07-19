package lesson8.task4;

public class Bclass {

    private int id;

    synchronized public void one(){
        System.out.println("One form B class");
    }

    synchronized public void two(){
        System.out.println("Two form B class");
    }

    synchronized public void three(){
        System.out.println("Three form B class");
    }

}
