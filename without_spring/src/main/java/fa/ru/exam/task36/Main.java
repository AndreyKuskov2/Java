package fa.ru.exam.task36;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            // Получение названия файла от пользователя
            String fileName = getUserInput("Введите название файла (n): ");

            // Получение требуемой операции от пользователя
            String operation = getUserInput("Введите операцию (сложение, умножение, разность): ");

            // Формирование имени входного файла и имени выходного файла
            String inputFile = "./src/main/java/fa/ru/exam/task36/" + fileName + ".txt";
            String outputFile = "./src/main/java/fa/ru/exam/task36/" + fileName + "_out.txt";

            // Выполнение обработки файла
            try {
                performFileProcessing(inputFile, outputFile, operation);
                System.out.println("Результат обработки сохранен в файле " + outputFile);
            } catch (IOException e) {
                System.out.println("Ошибка при обработке файла: " + e.getMessage());
            }
        }
    }

    private static String getUserInput(String message) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(message);
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении ввода пользователя: " + e.getMessage());
        }
        return null;
    }

    private static void performFileProcessing(String inputFile, String outputFile, String operation) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Чтение первого числа из файла
            String line = reader.readLine();
            double number1 = Double.parseDouble(line);

            // Чтение второго числа из файла
            line = reader.readLine();
            double number2 = Double.parseDouble(line);

            // Выполнение требуемой операции
            double result;
            switch (operation) {
                case "сложение":
                    result = number1 + number2;
                    break;
                case "умножение":
                    result = number1 * number2;
                    break;
                case "разность":
                    result = number1 - number2;
                    break;
                default:
                    throw new IllegalArgumentException("Неверная операция: " + operation);
            }

            // Вывод результата на экран
            System.out.println("Результат: " + result);

            // Запись результата в выходной файл
            writer.write(String.valueOf(result));
        }
    }
}

