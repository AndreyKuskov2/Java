package fa.ru.exam.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("ноль", 0);
        numbers.put("один", 1);
        numbers.put("два", 2);
        numbers.put("три", 3);
        numbers.put("четыре", 4);
        numbers.put("пять", 5);
        numbers.put("шесть", 6);
        numbers.put("семь", 7);
        numbers.put("восемь", 8);
        numbers.put("девять", 9);

        System.out.print("Введите выражение: ");
        String input = scanner.nextLine();

        String[] parts = input.split("\\s+");
        int firstNumber = numbers.get(parts[0]);
        int secondNumber = numbers.get(parts[2]);
        String operation = parts[1].trim();
        int result = 0;

        switch (operation) {
            case "плюс":
                result = firstNumber + secondNumber;
                break;
            case "минус":
                result = firstNumber - secondNumber;
                break;
            case "умножить":
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Неправильная операция");
                System.exit(0);
        }

        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() == result) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
