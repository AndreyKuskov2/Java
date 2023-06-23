package fa.ru.exam.task24;

import fa.ru.exam.task24.Form;

public class Main {
    public static void main(String[] args) {
        Form form = new Form();
        form.input();
        form.submit();

        SmartForm smartForm = new SmartForm();
        smartForm.input();
        smartForm.submit();

        System.out.println("Saved password: " + smartForm.getSavedPassword());
    }
}

