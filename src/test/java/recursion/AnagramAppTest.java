package recursion;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;


public class AnagramAppTest {


    @Before
    public void setUpStreams() throws FileNotFoundException {
        System.setOut(new PrintStream(new FileOutputStream("src/test/resources/anagramABCDEF.txt")));
    }

    @Test
    public void testDoAnagram() throws IOException {
        AnagramApp.anagram("abcdef");
        System.out.flush();
        System.out.close();
        final File expected = new File("src/test/resources/anagramABCDEF.txt");
        final File output =  new File("src/test/resources/anagramABCDEFTest.txt");
        assertTrue("The files differ!", FileUtils.contentEquals(expected , output));

    }

    @After
    public void cleanUpStreams() {
        PrintStream consoleOut = System.out;
        System.setOut(consoleOut);
    }
}