package fa.ru.exam.task37;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws IOException {
        double number1 = getInput("Введите первое число: ");
        double number2 = getInput("Введите второе число: ");

        try {
            double sum = add(number1, number2);
            printResult("Сумма: ", sum);
            writeResult("src/main/java/fa/ru/exam/task37/result.txt", "Сумма: " + sum);

            double difference = subtract(number1, number2);
            printResult("Разность: ", difference);
            writeResult("src/main/java/fa/ru/exam/task37/result.txt", "Разность: " + difference);

            double product = multiply(number1, number2);
            printResult("Произведение: ", product);
            writeResult("src/main/java/fa/ru/exam/task37/result.txt", "Произведение: " + product);

            double quotient = divide(number1, number2);
            printResult("Частное: ", quotient);
            writeResult("src/main/java/fa/ru/exam/task37/result.txt", "Частное: " + quotient);

            double power = power(number1, number2);
            printResult("Возведение в степень: ", power);
            writeResult("src/main/java/fa/ru/exam/task37/result.txt", "Возведение в степень: " + power);

            double logarithm1 = logarithm(number1);
            printResult("Логарифм первого числа: ", logarithm1);
            writeResult("src/main/java/fa/ru/exam/task37/result.txt", "Логарифм первого числа: " + logarithm1);

            double logarithm2 = logarithm(number2);
            printResult("Логарифм второго числа: ", logarithm2);
            writeResult("src/main/java/fa/ru/exam/task37/result.txt", "Логарифм второго числа: " + logarithm2);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
            writeResult("src/main/java/fa/ru/exam/task37/result.txt", "Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при записи результата в файл: " + e.getMessage());
        }
    }

    private static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print(message);
                number = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите корректное число.");
                scanner.nextLine(); // Очистка ввода
            }
        }

        return number;
    }

    private static double add(double number1, double number2) {
        return number1 + number2;
    }

    private static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    private static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    private static double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return number1 / number2;
    }

    private static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    private static double logarithm(double number) {
        if (number <= 0) {
            throw new ArithmeticException("Логарифм неопределен для неположительных чисел.");
        }
        return Math.log(number);
    }

    private static void printResult(String label, double result) {
        System.out.println(label + result);
    }

    private static void writeResult(String fileName, String result) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(result);
            writer.newLine();
        }
    }
}
