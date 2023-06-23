package fa.ru.exam.task16;

public class ArithmeticProgression implements Progress {
    private final double firstElement;
    private final double difference;

    public ArithmeticProgression(double firstElement, double difference) {
        this.firstElement = firstElement;
        this.difference = difference;
    }

    @Override
    public double calculateElement(int n) {
        return firstElement + difference * (n - 1);
    }

    @Override
    public double calculateSum(int n) {
        return ((2 * firstElement + (n - 1) * difference) / 2) * n;
    }
}
