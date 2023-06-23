package fa.ru.exam.task31;

import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        // Создаем два BitSet-а
        BitSet bitSet1 = new BitSet(8);
        BitSet bitSet2 = new BitSet(8);

        // Устанавливаем биты в первом BitSet-е
        bitSet1.set(0);
        bitSet1.set(2);
        bitSet1.set(4);
        bitSet1.set(6);

        // Устанавливаем биты во втором BitSet-е
        bitSet2.set(1);
        bitSet2.set(3);
        bitSet2.set(4);
        bitSet2.set(7);

        // Печатаем BitSet-ы
        System.out.println("BitSet 1: " + bitSet1);
        System.out.println("BitSet 2: " + bitSet2);

        // Выполняем битовую операцию AND
        BitSet andResult = (BitSet) bitSet1.clone();
        andResult.and(bitSet2);
        System.out.println("AND Result: " + andResult);

        // Выполняем битовую операцию OR
        BitSet orResult = (BitSet) bitSet1.clone();
        orResult.or(bitSet2);
        System.out.println("OR Result: " + orResult);

        // Выполняем битовую операцию XOR
        BitSet xorResult = (BitSet) bitSet1.clone();
        xorResult.xor(bitSet2);
        System.out.println("XOR Result: " + xorResult);

        // Выполняем операцию маскирования
        BitSet mask = new BitSet(8);
        mask.set(1);
        mask.set(4);
        mask.set(6);
        BitSet maskedResult = (BitSet) bitSet1.clone();
        maskedResult.and(mask);
        System.out.println("Masked Result: " + maskedResult);
    }
}
