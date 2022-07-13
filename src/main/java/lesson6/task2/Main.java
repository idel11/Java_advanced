package lesson6.task2;

/*
Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
Сделать полную документацию всех полей, методов, конструкторов класса
используя аннотацию Documented, либо же документационные комментарии.
*/

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        Calc calc = new Calc();
        Class<?> cl = calc.getClass();

        Method m1 = cl.getDeclaredMethod("add", int.class, int.class);
        MathAnnotation mathAnnotation1 = m1.getAnnotation(MathAnnotation.class);
        calc.add(mathAnnotation1.a(), mathAnnotation1.b());

        Method m2 = cl.getDeclaredMethod("sub", int.class, int.class);
        MathAnnotation mathAnnotation2 = m2.getAnnotation(MathAnnotation.class);
        calc.sub(mathAnnotation2.a(), mathAnnotation2.b());

        Method m3 = cl.getDeclaredMethod("mul", int.class, int.class);
        MathAnnotation mathAnnotation3 = m3.getAnnotation(MathAnnotation.class);
        calc.mul(mathAnnotation3.a(), mathAnnotation3.b());

        Method m4 = cl.getDeclaredMethod("div", int.class, int.class);
        MathAnnotation mathAnnotation4 = m4.getAnnotation(MathAnnotation.class);
        calc.div(mathAnnotation4.a(), mathAnnotation4.b());

        System.out.print("Test division on zero = ");
        calc.div(3, 0);

    }
}
