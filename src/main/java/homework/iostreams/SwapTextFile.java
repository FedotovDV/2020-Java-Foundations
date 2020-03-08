package homework.iostreams;


import java.io.*;
import java.util.*;


public class SwapTextFile {

//    C:\Dev\Cours\2020JavaFoundations\src\main\resources
// 2. Даны 2 файла. В каждом файле содержится текст.
// Необходимо поменять их местами.



    public static void main(String[] args) {

        File file1 = new File("src\\main\\resources\\Text1.txt");
        File file2 = new File("src\\main\\resources\\Text2.txt");
        swapTextFile(file1, file2);
    }

    private static void swapTextFile(File file1, File file2) {
        List<String> text1 = readTextFile(file1);
        List<String> text2 = readTextFile(file2);
        outputTextFile(file2, text1);
        outputTextFile(file1, text2);
    }

    private static List<String> readTextFile(File file) {
        List<String> text = new ArrayList<>();
        if(!file.exists()){
            System.out.println("Проверьте путь к файлу "+ file);
            text.add("Проверьте путь к файлу "+ file);
            return text;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    private static void outputTextFile(File file, List<String> text) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (String string : text) {
                bufferedWriter.write(string+ "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
