package fa.ru.exam.task21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int question;
        int variant;
        Scanner sc_str = new Scanner(System.in);
        Scanner sc_digit = new Scanner(System.in);
        String choice = "";

        while (!choice.equals("Нет")) {
            question = (int) (Math.random() * 10);
            for (int i = 0; i < 3; i++) {
                System.out.println("Попытка: " + (i + 1));
                System.out.println("Введите число: ");
                variant = sc_digit.nextInt();
                if (variant == question) {
                    System.out.println("Поздравляю вы выиграли!");
                    break;
                }
                if (variant > question) {
                    System.out.println("Введенное число меньше!");
                }
                else {
                    System.out.println("Введенное число больше!");
                }
                if ((variant != question) & (i == 2)) {
                    System.out.println("Вы проиграли!");
                    System.out.println("Число было: " + question);
                }
            }
            System.out.println("Сыграем в игру?");
            choice = sc_str.nextLine();
        }
    }
}
