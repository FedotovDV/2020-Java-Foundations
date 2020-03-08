package homework.iostreams;

import java.io.*;
import java.util.*;


public class SaveText {
    // 4. Написать свою запоминалку текста. Пользователь вводит имя файла и путь к нему.
// Затем вводит макимум 10 предложений и все сохраняются в файле по выбранному пути.

    public static void main(String[] args) {

        File file = new File("\\") ;
        List<String> text = new ArrayList<>();

        file = inputFileAndText(file, text);
        outputTextFile(file, text);


    }

    private static File inputFileAndText(File file, List<String> text) {
        String fileName;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите имя файла: ");
            fileName = bufferedReader.readLine();
            System.out.println("Введите путь: ");
            file = new File(bufferedReader.readLine() + "\\" + fileName);
            System.out.println("file = " + file);
            System.out.println("Введите текст: (и Exit для завершения)");
            String input;
            int count = 0;
            while ((count++ < 10) && !(input = bufferedReader.readLine()).equals("Exit")) {
                text.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static void outputTextFile(File file, List<String> text) {

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                for (String string : text) {
                    bufferedWriter.write(string+ "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }



}
