package lesson4.task3;

/*Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
С помощью этого методы выведите в консоль, сколько времени прошло с вашего дня рождения
 в удобном для восприятия виде, например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Time {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birthday in format dd.MM.yyyy: ");
        String date = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(date, formatter);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String time = endDate.toString().substring(8, 10)
                + "." + endDate.toString().substring(5, 7)
                + "." + endDate.toString().substring(0, 4)
                + " " + "00:00:00";

        long timeUp = format.parse(time).getTime();
        long diff = System.currentTimeMillis() - timeUp;
        long hours = diff / 3600000;
        long minutes = (diff % 3600000) / 60000;
        long seconds = ((diff % 3600000) % 60000) / 1000;

        System.out.println("You have already spent " + period.getYears() + " years, "
                + period.getMonths() + " months, "
                + period.getDays() + " days, "
                + hours + " hours, "
                + minutes + " minutes and "
                + seconds + " seconds!");

    }

}
