package fa.ru.exam.task14;

import static java.lang.Math.pow;

public class Rectangle {
    protected double a;
    protected double b;
    protected double c;


    Rectangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double square() {
        double p = (this.a + this.b + this.c) / 2;
        return pow(p * (p - this.a) * (p - this.b) * (p - this.c), 0.5);
    }

    public double perim() {
        return this.a + this.b + this.c;
    }
}
