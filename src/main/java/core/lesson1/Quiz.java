package core.lesson1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.*;

public class Quiz {

    public static void main(String[] args) throws Exception {
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        byte[] digest = md.digest("abracadabra".getBytes(StandardCharsets.UTF_8));
//        for (byte b : digest) {
//            System.out.printf("%02x", b);
//        }
//        List<String> lines = Arrays.asList("H?llo", "world");
//        Files.write(Paths.get("out.txt"), lines, StandardCharsets.US_ASCII);
//    }

        FileOutputStream fileOutputStream = new FileOutputStream("out.txt", true);

        String greetings = "Привет! \r\n";


        fileOutputStream.write(greetings.getBytes());

        fileOutputStream.close();
    }
}