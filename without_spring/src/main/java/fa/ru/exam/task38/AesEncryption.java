package fa.ru.exam.task38;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Arrays;

public class AesEncryption {

    private static final String ALGORITHM = "AES";

    public static void encrypt(String inputFile, String outputFile, String key) throws Exception {
        byte[] inputBytes = Files.readAllBytes(Paths.get(inputFile));
        byte[] hashedKey = hashKey(key);
        SecretKeySpec secretKeySpec = new SecretKeySpec(hashedKey, ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedBytes = cipher.doFinal(inputBytes);
        Files.write(Paths.get(outputFile), encryptedBytes);
    }

    public static void decrypt(String inputFile, String outputFile, String key) throws Exception {
        byte[] encryptedBytes = Files.readAllBytes(Paths.get(inputFile));
        byte[] hashedKey = hashKey(key);
        SecretKeySpec secretKeySpec = new SecretKeySpec(hashedKey, ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        Files.write(Paths.get(outputFile), decryptedBytes);
    }

    private static byte[] hashKey(String key) throws Exception {
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        byte[] hashedKey = sha.digest(key.getBytes(StandardCharsets.UTF_8));
        return Arrays.copyOf(hashedKey, 16);
    }
}
