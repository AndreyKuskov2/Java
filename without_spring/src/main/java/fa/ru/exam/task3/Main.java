package fa.ru.exam.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        String str = Integer.toString(n); // Преобразуем число в строку

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) { // Проверяем, является ли символ цифрой
                System.out.println(c); // Выводим цифру в консоль
            }
        }
    }
}