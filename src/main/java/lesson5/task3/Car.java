package lesson5.task3;

import java.time.LocalDate;

public class Car {

    static int speed = 200;
    static String color;
    static LocalDate year;

    public Car(int speed, String color, LocalDate year) {
        this.speed = speed;
        this.color = color;
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
