package fa.ru.exam.task20;

public class MyMath {
    public static double pow(double item, double pow) {
        for (int i = 1; i < pow; i++) {
            double item_mn = item;
            item *= item_mn;
        }
        return item;
    }

    public static double abs(double item) {
        if (item >= 0)
            return item;
        return -item;
    }

    public static int round(double item) {
        return (int) item;
    }

}
