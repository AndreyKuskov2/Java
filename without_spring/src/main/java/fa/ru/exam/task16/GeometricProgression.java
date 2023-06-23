package fa.ru.exam.task16;

public class GeometricProgression implements Progress {
    private final double firstElement;
    private final double ratio;

    public GeometricProgression(double firstElement, double ratio) {
        this.firstElement = firstElement;
        this.ratio = ratio;
    }

    @Override
    public double calculateElement(int n) {
        return firstElement * Math.pow(ratio, n - 1);
    }

    @Override
    public double calculateSum(int n) {
        if (ratio == 1) {
            return firstElement * n;
        }
        return firstElement * (1 - Math.pow(ratio, n)) / (1 - ratio);
    }
}
