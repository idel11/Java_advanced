package lesson4.task2;

/*Напишите шуточную программу «Дешифратор», которая бы в текстовом файле
 могла бы заменить все предлоги на слово «Java».*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.regex.*;

public class ReplaceAdjective {

    public static void main(String[] args) throws IOException {

        String sourceFile = "src/main/java/lesson4/task2/Source.txt";
        String outputFile = "src/main/java/lesson4/task2/outFile.txt";

        String tmp = new String(Files.readAllBytes(Paths.get(sourceFile)));

        Pattern p = Pattern.compile("\\b(?:In|in|with|on|to)\\b");
        Matcher m = p.matcher(tmp);
        tmp = m.replaceAll("JAVA");

        FileWriter fileWriter = new FileWriter(outputFile);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(tmp);
        printWriter.close();

    }

}
