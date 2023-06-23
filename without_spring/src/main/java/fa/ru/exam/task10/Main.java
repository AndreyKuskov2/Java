package fa.ru.exam.task10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Читаем дату с клавиатуры
        System.out.print("Введите дату в формате ДД.ММ.ГГ: ");
        String dateString = scanner.next();

        // Создаем объект класса SimpleDateFormat для парсинга строки в дату
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");

        try {
            // Парсим строку в дату
            Date date = dateFormat.parse(dateString);

            // Создаем объект класса Calendar и устанавливаем дату
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // Получаем номер недели
            int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);

            // Выводим номер недели
            System.out.println("Неделя " + weekNumber);
        } catch (Exception e) {
            System.out.println("Некорректный формат даты");
        }
    }
}
