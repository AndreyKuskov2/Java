package fa.ru.exam.task15;

public class Pram extends Function {
    Pram(double param) {
        super(param);
    }

    public double calc() {
        return this.param * this.param;
    }
}
