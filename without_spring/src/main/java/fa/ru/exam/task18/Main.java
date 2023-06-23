package fa.ru.exam.task18;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Binary с заданной длиной
        Binary binary1 = new Binary(8);

        // Конвертация десятичного числа в двоичный массив
        int decimal1 = 10;
        binary1.fromDecimal(decimal1);

        // Получение двоичного массива
        char[] binaryArray1 = binary1.getBinaryArray();
        System.out.println("Binary representation of " + decimal1 + ": " + String.valueOf(binaryArray1));

        // Конвертация двоичного массива обратно в десятичное число
        int decimalValue1 = binary1.toDecimal();
        System.out.println("Decimal representation of " + String.valueOf(binaryArray1) + ": " + decimalValue1);

        System.out.println();

        // Создание объекта Binary с заданным двоичным массивом
        char[] binaryArray2 = {'1', '0', '1', '1'};
        Binary binary2 = new Binary(binaryArray2);

        // Получение двоичного массива
        char[] binaryArray3 = binary2.getBinaryArray();
        System.out.println("Binary representation: " + String.valueOf(binaryArray3));

        // Конвертация двоичного массива обратно в десятичное число
        int decimalValue2 = binary2.toDecimal();
        System.out.println("Decimal representation: " + decimalValue2);
    }
}

