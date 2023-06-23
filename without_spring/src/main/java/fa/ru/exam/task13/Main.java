package fa.ru.exam.task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Заполняем матрицу случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        // Ищем сумму граничных элементов
        int sum = matrix[0][0] + matrix[0][cols - 1] + matrix[rows - 1][0] + matrix[rows - 1][cols - 1];

        // Пока сумма не равна 666, продолжаем заполнять матрицу
        while (sum != 666) {
            // Выбираем случайную ячейку
            int i = (int) (Math.random() * rows);
            int j = (int) (Math.random() * cols);

            // Если ячейка не граничная, заменяем ее на новое случайное число
            if (i != 0 && i != rows - 1 && j != 0 && j != cols - 1) {
                matrix[i][j] = (int) (Math.random() * 100) + 1;

                // Пересчитываем сумму граничных элементов
                sum = matrix[0][0] + matrix[0][cols - 1] + matrix[rows - 1][0] + matrix[rows - 1][cols - 1];
            }
        }

        // Выводим матрицу на экран
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
