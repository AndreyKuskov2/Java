package fa.ru.exam.task25;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.setName("Иван");
        w1.setAge(25);
        w1.setSalary(1000);

        Worker w2 = new Worker();
        w2.setName("Вася");
        w2.setAge(26);
        w2.setSalary(2000);

        double sum = w1.getSalary() + w2.getSalary();
        System.out.println("Сумма зарплат Ивана и Васи: " + sum);

        Student s1 = new Student();
        s1.setName("Вася");
        s1.setAge(26);
        s1.setCource(2);
        s1.setStip(30000);
    }
}
