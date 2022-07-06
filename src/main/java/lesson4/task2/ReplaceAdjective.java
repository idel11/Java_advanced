package lesson4.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReplaceAdjective {


    public static void main(String[] args) throws IOException {

        String sourceFile = "src/main/java/lesson4/task2/Source.txt";
        String outputFile = "src/main/java/lesson4/task2/outFile.txt";

        String tmp = new String(Files.readAllBytes(Paths.get(sourceFile)));
        System.out.println(tmp);

        Pattern p = Pattern.compile("\\b(?:In|in|with|on|to)\\b");
        Matcher m = p.matcher(tmp);
        tmp = m.replaceAll("JAVA");

        FileWriter fileWriter = new FileWriter(outputFile);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(tmp);
        printWriter.close();

    }

}
