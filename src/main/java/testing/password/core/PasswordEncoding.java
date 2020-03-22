package testing.password.core;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class PasswordEncoding {



    public void setPassword(byte[] pass) throws Exception {
        byte[] salt = generateSalt(12);
        byte[] input = appendArrays(pass, salt);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] hashVal = messageDigest.digest(input);
        clearArray(pass);
        clearArray(input);
        saveBytes(salt, new File("salt.bin"));
        saveBytes(hashVal, new File("password.bin"));
        clearArray(salt);
        clearArray(hashVal);

    }

    public boolean checkPassword(byte[] pass) throws Exception {
        byte[] salt = loadBytes(new File("salt.bin"));
        byte[] input = appendArrays(pass, salt);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] hashVal1 = messageDigest.digest(input);
        clearArray(pass);
        clearArray(input);
        byte[] hashVal2 = loadBytes(new File("password.bin"));
        boolean arraysEqual = Arrays.equals(hashVal1, hashVal2);
        clearArray(hashVal1);
        clearArray(hashVal2);
        return arraysEqual;
    }

    private byte[] loadBytes(File file) {
        byte[] fileInArray = new byte[(int) file.length()];
        try (FileInputStream reader = new FileInputStream(file)) {
            reader.read(fileInArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileInArray;
    }

    private void saveBytes(byte[] bytes, File file) {
        try (BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(file))) {
            for (byte b : bytes) {
                writer.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clearArray(byte[] array) {
        Arrays.fill(array, (byte) 0);
    }

    private byte[] appendArrays(byte[] a, byte[] b) {
        byte[] c = new byte[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }

    private byte[] generateSalt(int n) {
        byte[] bytes = new byte[ n];
        try {
            SecureRandom.getInstanceStrong().nextBytes(bytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return bytes;
    }

}
