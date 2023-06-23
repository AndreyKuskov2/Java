package fa.ru.exam.task35;

public class Main {
            public static void main(String[] args) {
                // Создание матрицы A
                Matrix matrixA = new Matrix(2, 2);
                matrixA.data = new int[][]{{1, 2}, {3, 4}};

                // Создание матрицы B
                Matrix matrixB = new Matrix(2, 2);
                matrixB.data = new int[][]{{5, 6}, {7, 8}};

                // Сложение матриц
                Matrix sum = matrixA.add(matrixB);
                System.out.println("Сумма матриц:");
                sum.print();

                // Вычитание матриц
                Matrix difference = matrixA.subtract(matrixB);
                System.out.println("Разность матриц:");
                difference.print();

                // Умножение матрицы на число
                int scalar = 2;
                Matrix scalarProduct = matrixA.multiplyByScalar(scalar);
                System.out.println("Умножение матрицы на число " + scalar + ":");
                scalarProduct.print();

                // Умножение матриц
                Matrix product = matrixA.multiply(matrixB);
                System.out.println("Произведение матриц:");
                product.print();

                // Транспонирование матрицы
                Matrix transposed = matrixA.transpose();
                System.out.println("Транспонированная матрица:");
                transposed.print();

                // Возведение матрицы в степень
                int exponent = 2;
                Matrix power = matrixA.power(exponent);
                System.out.println("Возведение матрицы в степень " + exponent + ":");
                power.print();
            }
        }