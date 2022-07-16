package lesson6.task2;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MathAnnotation {
    int a() default 1;
    int b() default 1;
}
