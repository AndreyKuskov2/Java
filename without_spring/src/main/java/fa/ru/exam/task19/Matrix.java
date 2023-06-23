package fa.ru.exam.task19;

public class Matrix {


    public int[][] gener(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    public int[][] gener_random(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public int[][] plus(int[][] m1, int[][] m2, int n1, int n2, int n3, int n4) {
        int item;
        int[][] matrix = new int[n1][n4];
        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < n4; j++) {
                item = 0;
                for (int k = 0; k < n3; k++) {
                    item += m1[i][k] * m2[j][i];
                }
                matrix[i][j] = item;
            }

        }
        return matrix;
    }
}
