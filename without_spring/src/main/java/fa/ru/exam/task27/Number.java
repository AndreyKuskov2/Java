package fa.ru.exam.task27;

public class Number {
    public static String to_bin(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static String to_eigth(int decimal) { return Integer.toOctalString(decimal); }

    public static String to_hex(int decimal) { return Integer.toHexString(decimal); }
}
