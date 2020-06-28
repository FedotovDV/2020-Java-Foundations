package core.lesson5;

import java.io.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ReadAsString {

    public static void main(String[] args) throws IOException {
        byte[] bb = new byte[]{48, 49, 50, 51}; //0123
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bb);
        System.out.println(readAsString(inputStream, StandardCharsets.US_ASCII));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder result = new StringBuilder();
        int variable;
        InputStreamReader reader = new InputStreamReader(inputStream, charset);
        while ((variable = reader.read()) != -1) {
            result.append((char) variable);
        }
        return result.toString();
    }
}
