package fa.ru.exam.task18;

public class Binary {
    private char[] binaryArray;

    public Binary(int length) {
        binaryArray = new char[length];
    }

    public Binary(char[] binaryArray) {
        this.binaryArray = binaryArray;
    }

    public char[] getBinaryArray() {
        return binaryArray;
    }

    public void setBinaryArray(char[] binaryArray) {
        this.binaryArray = binaryArray;
    }

    public int toDecimal() {
        int decimal = 0;
        int power = binaryArray.length - 1;

        for (int i = 0; i < binaryArray.length; i++) {
            int bitValue = binaryArray[i] - '0';
            decimal += bitValue * Math.pow(2, power);
            power--;
        }

        return decimal;
    }

    public void fromDecimal(int decimal) {
        if (decimal >= 0) {
            convertPositive(decimal);
        } else {
            convertNegative(decimal);
        }
    }

    private void convertPositive(int decimal) {
        int index = binaryArray.length - 1;

        while (decimal > 0 && index >= 0) {
            binaryArray[index] = (char) ((decimal % 2) + '0');
            decimal /= 2;
            index--;
        }

        while (index >= 0) {
            binaryArray[index] = '0';
            index--;
        }
    }

    private void convertNegative(int decimal) {
        decimal = Math.abs(decimal);
        convertPositive(decimal);

        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == '0') {
                binaryArray[i] = '1';
            } else {
                binaryArray[i] = '0';
            }
        }

        addOneToBinary();
    }

    private void addOneToBinary() {
        int carry = 1;

        for (int i = binaryArray.length - 1; i >= 0; i--) {
            int bitValue = binaryArray[i] - '0';
            int sum = bitValue + carry;

            if (sum == 2) {
                binaryArray[i] = '0';
                carry = 1;
            } else {
                binaryArray[i] = (char) (sum + '0');
                carry = 0;
            }
        }
    }
}
