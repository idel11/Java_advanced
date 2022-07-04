package lesson3.Task2;

/*Создайте файл, запишите в него произвольные данные и закройте файл.
Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.*/

import java.io.*;
import java.util.Scanner;

public class FileHandle {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("f1.txt")));
        System.out.print("Enter some text what will be written into file 'f1': ");
        out.writeBytes(sc.nextLine());
        out.flush();
        out.close();

        BufferedReader br = new BufferedReader(new FileReader("f1.txt"));
        String tmp;
        while ((tmp = br.readLine()) != null) {
            System.out.println(tmp);
        }
        br.close();

    }
}
