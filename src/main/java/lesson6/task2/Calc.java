package lesson6.task2;

/**
 * @author dmytro_lyshtvan
 */

public class Calc {

    /**
     * this is a method for adding one number to another
     * @param a is a first number
     * @param b is a second number
     */
    @MathAnnotation(b = 6)
    static void add(int a, int b) {
        System.out.println("(a + b) = " + (a + b));
    }

    /**
     * this is a method for subtracting one number from another
     * @param a is a first number
     * @param b is a second number
     */
    @MathAnnotation(a = 4)
    static void sub(int a, int b) {
        System.out.println("(a - b) = " + (a - b));
    }

    /**
     * this is a method for multiply one number on another
     * @param a is a first number
     * @param b is a second number
     */
    @MathAnnotation(a = 3, b = 7)
    static void mul(int a, int b) {
        System.out.println("(a * b) = " + (a * b));
    }

    /**
     * this is a method for dividing one number by another
     * @param a is a first number
     * @param b is a second number
     */
    @MathAnnotation(a = 6, b = 3)
    static void div(int a, int b) {
        if (b != 0) {
            System.out.println("(a / b) = " + (a / b));
        } else System.err.println("No division on zero");
    }
}
