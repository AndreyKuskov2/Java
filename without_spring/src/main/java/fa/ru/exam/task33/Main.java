package fa.ru.exam.task33;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        // Создаем двумерный массив случайных чисел
        int[][] data = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = random.nextInt(10);
            }
        }

        // Выводим таблицу в консоль
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        // Находим максимальное и минимальное значения с индексами ячеек
        int max = data[0][0];
        int min = data[0][0];
        int maxRow = 0;
        int maxCol = 0;
        int minRow = 0;
        int minCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                    maxRow = i;
                    maxCol = j;
                }
                if (data[i][j] < min) {
                    min = data[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        // Выводим максимальное и минимальное значения с индексами ячеек
        System.out.println("Максимальное значение: " + max + " (строка " + maxRow + ", столбец " + maxCol + ")");
        System.out.println("Минимальное значение: " + min + " (строка " + minRow + ", столбец " + minCol + ")");
    }
}
