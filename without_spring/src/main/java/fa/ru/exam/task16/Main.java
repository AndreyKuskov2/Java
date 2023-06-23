package fa.ru.exam.task16;

public class Main {
    public static void main(String[] args) {
        ArithmeticProgression ap = new ArithmeticProgression(1, 2);
        System.out.println("5-й элемент арифметической прогрессии: " + ap.calculateElement(5));
        System.out.println("Сумма первых 5 элементов арифметической прогрессии: " + ap.calculateSum(5));

        GeometricProgression gp = new GeometricProgression(2, 3);
        System.out.println("5-й элемент геометрической прогрессии: " + gp.calculateElement(5));
        System.out.println("Сумма первых 5 элементов геометрической прогрессии: " + gp.calculateSum(5));
    }
}
