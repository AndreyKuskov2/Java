package fa.ru.exam.task15;


public class Main {
    public static void main(String[] args){
        Pram parab = new Pram(-5);
        System.out.println(parab.calc());
        Linear linear = new Linear(-5);
        System.out.println(linear.calc());
    }
}
