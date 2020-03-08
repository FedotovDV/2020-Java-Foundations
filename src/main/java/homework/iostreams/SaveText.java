package homework.iostreams;

import java.io.*;
import java.util.*;


public class SaveText {
    // 4. Написать свою запоминалку текста. Пользователь вводит имя файла и путь к нему.
// Затем вводит макимум 10 предложений и все сохраняются в файле по выбранному пути.

    public static void main(String[] args) {

        File file = new File("\\");
        List<String> text = new ArrayList<>();
        file = inputFileAndText(file, text);
        outputTextFile(file, text);


    }

    private static File inputFileAndText(File file, List<String> text) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            file = inputFile(bufferedReader);
            inputText(file, text, bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static File inputFile(BufferedReader bufferedReader) throws IOException {
        String fileName;
        System.out.println("Введите имя файла: ");
        fileName = bufferedReader.readLine();
        System.out.println("Введите путь: ");
        File file = new File(bufferedReader.readLine() + "\\" + fileName);
        System.out.println("file = " + file);
        return file;
    }

    private static List<String> inputText(File file, List<String> text, BufferedReader bufferedReader) throws IOException {
        System.out.println("Введите текст: (и Exit для завершения)");
        String input;
        int count = 0;
        while ((count++ < 10) && !(input = bufferedReader.readLine()).equals("Exit")) {
            text.add(input);
        }
        return text;
    }

    private static void outputTextFile(File file, List<String> text) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (String string : text) {
                bufferedWriter.write(string + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
