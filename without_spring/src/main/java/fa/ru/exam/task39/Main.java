package fa.ru.exam.task39;

public class Main {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 48;

        int gcd = findGCDRecursive(num1, num2);

        System.out.println("Наибольший общий делитель, вычисленный с помощью рекурсии: " + gcd);

        gcd = findGCDEuclidean(num1, num2);

        System.out.println("Наибольший общий делитель, вычисленный без рекурсии: " + gcd);
    }

    private static int findGCDRecursive(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCDRecursive(num2, num1 % num2);
    }

    private static int findGCDEuclidean(int num1, int num2) {
        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }
}
