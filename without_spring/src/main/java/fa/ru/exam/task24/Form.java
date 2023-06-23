package fa.ru.exam.task24;

import java.util.Scanner;

public class Form {
    protected String password;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password:");
        password = scanner.nextLine();
    }

    public void submit() {
        System.out.println("Form submitted");
    }

    public String getPassword() {
        return password;
    }
}
