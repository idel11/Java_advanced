package lesson7.task2;

/*
Необходимо осуществить десериализацию с файла предыдущего проекта(Animal)
и вывести на экран содержимое.
*/

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("src/main/java/lesson7/task2/serial");
        Animal1 cat = new Animal1(4,"mammal",true);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(cat);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Animal1 dCat = (Animal1) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("legs: " + dCat.getLegs()
                + ", kind: " + dCat.getKind()
                + ", is predator:" + dCat.getPredator());

    }
}
