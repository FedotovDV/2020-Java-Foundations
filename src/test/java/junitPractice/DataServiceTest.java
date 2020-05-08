package junitPractice;
import org.junit.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;

public class DataServiceTest {

    @BeforeClass
    public static void setUpAll() {
        System.out.println("Run before class!");
    }

    @AfterClass
    public static void tearDownAll() {
        System.out.println("Run after class!");
    }

    @Before
    public void setUp() {
        System.out.println("Run before every test!");
    }

    @After
    public void tearDown() {
        System.out.println("Run after each test!");
    }

    @Test
    public void test() {
        System.out.println("Test passed!");
    }

    @Test
    public void testFindMax() throws Exception {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> numbers2 = Arrays.asList(-1, 0, 88, 5, 64, 5);
        int max1 = DataService.findMax(numbers1);
        int max2 = DataService.findMax(numbers2);
        assertThat(max1).isEqualTo(7);
        assertThat(max2).isNotNull().isGreaterThan(60).isLessThan(100).isEqualTo(88);

    }


    @Test(expected = Exception.class)
    public void testFindMaxException() throws Exception {
        List<Integer> numbers = Collections.emptyList();
        DataService.findMax(numbers);
    }

    @Test
    public void testfindMaxByStream() throws Exception {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> numbers2 = Arrays.asList(-1, 0, 88, 5, 64, 5);
        int max1 = DataService.findMaxByStream(numbers1);
        int max2 = DataService.findMaxByStream(numbers2);
        assertThat(max1).isEqualTo(7);
        assertThat(max2).isEqualTo(88);

    }


    @Test(expected = Exception.class)
    public void testfindMaxByStreamException() throws Exception {
        List<Integer> numbers = Arrays.asList();
        DataService.findMaxByStream(numbers);
    }

    @Test(expected = Exception.class)
    public void testfindMaxByStreamExceptionNullList() throws Exception {
        List<Integer> numbers = null;
        DataService.findMaxByStream(numbers);
    }

    @Test(timeout = 100)
    public void testPerformance() throws Exception {

        List<Integer> numbers = Stream.iterate(0, n -> n + 1).limit(2000).collect(Collectors.toList());
        DataService.findMaxByStream(numbers);
    }

}