package fa.ru.exam.task22;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Есть ошибка в условии: дата может вводится, но при этом только 2022 год. Уточнить у препода

public class Main {
    public static void main(String[] args) {
        // Ввод даты от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год (YYYY): ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int monthValue = scanner.nextInt();
        scanner.close();

        Month month = Month.of(monthValue);

        // Генерация рабочего календаря
        List<LocalDate> workSchedule = generateWorkSchedule(year, month);

        // Вывод расписания
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Рабочий календарь на " + month + " " + year);
        for (LocalDate date : workSchedule) {
            System.out.println(formatter.format(date));
        }
    }

    public static List<LocalDate> generateWorkSchedule(int year, Month month) {
        List<LocalDate> schedule = new ArrayList<>();
        LocalDate startDate = LocalDate.of(year, month, 1);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

        LocalDate current = startDate;
        while (current.isBefore(endDate) || current.isEqual(endDate)) {
            if (current.getDayOfWeek() == DayOfWeek.SUNDAY) {
                current = current.plusDays(1);
            }

            schedule.add(current);
            current = current.plusDays(3);
        }

        return schedule;
    }
}
