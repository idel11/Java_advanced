package lesson6.task4;

/*
Создать свою аннотацию, которая будет содержать параметры для метода,
выполнить сложение 2-х чисел.

@Math(num1 = 100, num2 = 200)
public void mathSum(int num1, int num2)
*/

import java.lang.reflect.Method;

public class Calc {

    @Math
    public void mathSum(int num1, int num2) {
        System.out.println("(num1 + num2) = " + (num1 + num2));
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Calc calc = new Calc();
        Class<?> cl = calc.getClass();
        Method m = cl.getDeclaredMethod("mathSum", int.class, int.class);
        Math math1 = m.getAnnotation(Math.class);
        calc.mathSum(math1.num1(), math1.num2());
    }

}
