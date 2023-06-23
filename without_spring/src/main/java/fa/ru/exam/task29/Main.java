package fa.ru.exam.task29;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 100 + 1);
            list.add(num);
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}
