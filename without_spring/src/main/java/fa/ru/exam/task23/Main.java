package fa.ru.exam.task23;

public class Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(4, -1);

        ComplexNumber sum = number1.add(number2);
        ComplexNumber difference = number1.subtract(number2);
        ComplexNumber product = number1.multiply(number2);

        System.out.println("Sum: " + sum.getRealPart() + " + " + sum.getImaginaryPart() + "i");
        System.out.println("Difference: " + difference.getRealPart() + " + " + difference.getImaginaryPart() + "i");
        System.out.println("Product: " + product.getRealPart() + " + " + product.getImaginaryPart() + "i");
    }
}

