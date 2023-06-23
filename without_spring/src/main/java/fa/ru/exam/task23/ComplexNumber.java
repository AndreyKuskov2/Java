package fa.ru.exam.task23;

public class ComplexNumber {
    private int[] parts; // Массив из двух чисел: вещественная и мнимая части

    public ComplexNumber(int realPart, int imaginaryPart) {
        parts = new int[]{realPart, imaginaryPart};
    }

    public int getRealPart() {
        return parts[0];
    }

    public int getImaginaryPart() {
        return parts[1];
    }

    public ComplexNumber add(ComplexNumber other) {
        int realPart = this.getRealPart() + other.getRealPart();
        int imaginaryPart = this.getImaginaryPart() + other.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        int realPart = this.getRealPart() - other.getRealPart();
        int imaginaryPart = this.getImaginaryPart() - other.getImaginaryPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        int realPart = this.getRealPart() * other.getRealPart() - this.getImaginaryPart() * other.getImaginaryPart();
        int imaginaryPart = this.getRealPart() * other.getImaginaryPart() + this.getImaginaryPart() * other.getRealPart();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
