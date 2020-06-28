package core.lesson5.com.javamentor.iostreams;

import java.io.*;
import java.nio.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        sumDouble();
    }


    private static void sumDouble() {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("en"))) {
            double result = 0;
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    result += scanner.nextDouble();
                } else {
                    scanner.next();
                }
            }
            System.out.printf("%.6f", result);
        }
    }

}
