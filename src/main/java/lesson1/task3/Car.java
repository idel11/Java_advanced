package lesson1.task3;

public class Car implements Comparable {
    private int speed;
    private int price;
    private int id;
    private String model;
    private String color;

    Car(int id, int speed, int price, String model, String color) {
        this.id = id;
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.id + " " + this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    public int compareTo(Object o) {
        int temp = this.speed - ((Car)o).speed;
        if (temp == 0) {
            temp = this.price - ((Car)o).price;
            if(temp == 0){
                temp = this.model.compareTo(((Car)o).model);
                if(temp == 0){
                    return this.color.compareTo(((Car)o).color);
                }
            }
        } return temp;
    }
}
