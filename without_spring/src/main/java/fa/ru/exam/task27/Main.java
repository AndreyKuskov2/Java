package fa.ru.exam.task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int decimal = scanner.nextInt();
        System.out.print("Выберите систему счисления (2 - двоичная, 8 - восьмеричная, 16 - шестнадцатеричная): ");
        int base = scanner.nextInt();

        if (base == 2) {
            System.out.println("В двоичной: " + Number.to_bin(decimal));
        } else if (base == 8) {
            System.out.println("В восьмеричной: " + Number.to_eigth(decimal));
        } else if (base == 16) {
            System.out.println("В шестнадцатиричной: " + Number.to_hex(decimal));
        } else {
            System.out.println("Неверный формат системы счисления");
        }
    }
}
