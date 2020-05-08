package recursion;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CreateAnagramTestFile {


    public static void main(String[] args) throws FileNotFoundException {
        System.setOut(new PrintStream(new FileOutputStream("src/test/resources/anagramABCDEFTest.txt")));
        AnagramApp.anagram("abcdef");
        System.out.flush();
        System.out.close();
        PrintStream consoleOut = System.out;
        System.setOut(consoleOut);
    }
}
