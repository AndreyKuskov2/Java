package fa.ru.exam.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        for (int i = 0; i < 6; i++) {
            System.out.println(word);
        }
    }
}
