package core.lesson5;

import java.io.*;
import java.util.Arrays;

public class SumOfStream {

    public static void main(String[] args) throws IOException {
        byte[] arr = {10, -1, -2, 5, 20, 3};
        System.out.println(sumOfStream(new ByteArrayInputStream(arr)));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        print(new ByteArrayInputStream(arr), outputStream);
        byte[] oddArray = outputStream.toByteArray();
        System.out.println("oddArray = " + Arrays.toString(oddArray));

    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int readByte;
        int sum = 0;
        while (inputStream.available() > 0) {
            if ((readByte = inputStream.read()) > 127) {
                sum += readByte - 256;
            } else {
                sum += readByte;
            }
        }
        return sum;
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int readByte;
        while (inputStream.available() > 0) {
            if ((readByte = inputStream.read()) % 2 == 0) {
                outputStream.write(readByte);
            }
        }
        outputStream.close();
    }

}
