package fa.ru.exam.task12;

public class Main {
    private final double meaning;

    Main(double meaning) {
        this.meaning = meaning;
    }

    public double getMeaning() {
        return meaning;
    }

    public static Main add(Main d1, Main d2) {
        return new Main(d1.getMeaning() + d2.getMeaning());
    }

    public static Main divide(Main d1, Main d2) {
        try {
            return new Main(d1.getMeaning() / d2.getMeaning());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на 0");
            return null;
        }
    }

    public static Main pow(Main d1, Main d2) {
        return new Main(Math.pow(d1.getMeaning(), d2.getMeaning()));
    }

    public static void main(String[] args) {
        Main b1 = new Main(5);
        Main b2 = new Main(2.5);
        System.out.println(Main.add(b1, b2).getMeaning());
        System.out.println(Main.divide(b1, b2).getMeaning());
        System.out.println(Main.pow(b1, b2).getMeaning());
    }
}
