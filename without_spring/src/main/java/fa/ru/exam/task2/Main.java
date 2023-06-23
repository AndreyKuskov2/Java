package fa.ru.exam.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "I have 3 cats, 4 dogs, and 1 turtle 53";
        String[] words = str.split("\\s+"); // Разбиваем строку на слова

        List<Integer> numbers = new ArrayList<>(); // Создаем список для хранения чисел

        for (String word : words) {
            if (word.matches("\\d+")) { // Проверяем, является ли слово числом
                numbers.add(Integer.parseInt(word)); // Добавляем число в список
            }
        }

        Integer[] array = numbers.toArray(new Integer[0]); // Преобразуем список в массив

        System.out.println(Arrays.toString(array)); // Выводим массив в консоль
    }
}