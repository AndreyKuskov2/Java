package fa.ru.exam.task17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        int[] sumResult = arraySum.sum(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println("Результат сложения массивов: " + Arrays.toString(sumResult));

        OrArray orArray = new OrArray();
        int[] orResult = orArray.sum(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println("Результат операции ИЛИ между массивами: " + Arrays.toString(orResult));
    }
}
