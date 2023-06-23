package fa.ru.exam.task30;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        // заполнение списка случайными числами
        System.out.print("Введите количество элементов списка: ");
        int n = scanner.nextInt();
        System.out.print("Введите минимальное значение элементов списка: ");
        int min = scanner.nextInt();
        System.out.print("Введите максимальное значение элементов списка: ");
        int max = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * (max - min + 1) + min);
            list.add(num);
        }
        System.out.println("Список: " + list);

        // поиск числа в списке
        System.out.print("Введите число для поиска: ");
        int searchNum = scanner.nextInt();
        int index = binarySearch(list, searchNum);
        if (index != -1) {
            System.out.println("Число " + searchNum + " найдено в списке на позиции " + index);
        } else {
            System.out.println("Число " + searchNum + " не найдено в списке");
        }
    }

    // бинарный поиск числа в отсортированном списке
    public static int binarySearch(ArrayList<Integer> list, int searchNum) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (list.get(mid) == searchNum) {
                return mid;
            } else if (list.get(mid) < searchNum) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
