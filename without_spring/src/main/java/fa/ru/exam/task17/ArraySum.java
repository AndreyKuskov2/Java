package fa.ru.exam.task17;

// Класс ArraySum имплементирует интерфейс InArray
public class ArraySum implements InArray {
    // Метод сложения двух массивов
    public int[] sum(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Массивы должны быть одной и той же длины");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }
}
