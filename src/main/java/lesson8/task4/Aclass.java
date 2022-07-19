package lesson8.task4;

public class Aclass extends Thread {

    private Bclass b;

    public Aclass(Bclass b) {
        this.b = b;
    }

    synchronized public void one(){
        System.out.println("One form A class");
        b.one();
    }

    synchronized public void two(){
        System.out.println("Two form A class");
        b.two();
    }

    synchronized public void three(){
        System.out.println("Three form A class");
        b.three();
    }

    @Override
    public void run() {
        one();
        two();
        three();
    }
}
