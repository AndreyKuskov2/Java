package fa.ru.exam.task34;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создаем первую коллекцию имен
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Иван");
        names1.add("Петр");
        names1.add("Мария");

        // Создаем вторую коллекцию имен
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Анна");
        names2.add("Дмитрий");
        names2.add("Елена");

        // Выводим имена из первой коллекции
        System.out.println("Имена из первой коллекции:");
        for (String name : names1) {
            System.out.println(name);
        }

        // Выводим имена из второй коллекции
        System.out.println("Имена из второй коллекции:");
        for (String name : names2) {
            System.out.println(name);
        }
    }
}
