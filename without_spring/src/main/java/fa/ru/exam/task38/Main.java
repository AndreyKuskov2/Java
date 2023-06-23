package fa.ru.exam.task38;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = "./src/main/java/fa/ru/exam/task38/input.txt";
        String encryptedFile = "./src/main/java/fa/ru/exam/task38/encrypted.dat";
        String decryptedFile = "./src/main/java/fa/ru/exam/task38/decrypted.txt";
        String key = "mysecretkey";

        AesEncryption.encrypt(inputFile, encryptedFile, key);
        AesEncryption.decrypt(encryptedFile, decryptedFile, key);
    }
}
