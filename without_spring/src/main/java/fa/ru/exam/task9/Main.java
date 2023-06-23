package fa.ru.exam.task9;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Читаем год, месяц и день с клавиатуры
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt() - 1; // Номер месяца в Calendar начинается с 0

        System.out.print("Введите день (1-31): ");
        int day = scanner.nextInt();

        // Создаем объект класса Calendar и устанавливаем дату
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        // Получаем номер дня недели (1 - воскресенье, 2 - понедельник, и т.д.)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Выводим название дня недели
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                System.out.println("Воскресенье");
                break;
            case Calendar.MONDAY:
                System.out.println("Понедельник");
                break;
            case Calendar.TUESDAY:
                System.out.println("Вторник");
                break;
            case Calendar.WEDNESDAY:
                System.out.println("Среда");
                break;
            case Calendar.THURSDAY:
                System.out.println("Четверг");
                break;
            case Calendar.FRIDAY:
                System.out.println("Пятница");
                break;
            case Calendar.SATURDAY:
                System.out.println("Суббота");
                break;
        }
    }
}
