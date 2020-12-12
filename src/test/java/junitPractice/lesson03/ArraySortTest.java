package junitPractice.lesson03;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraySortTest {

    @Test
    public void testBubbleSort(){
        int[] array = {4, 12, -17, 3};
        int[]  arrayExpected = {-17, 3, 4, 12};
        junitPractice.lesson03.ArraySort.bubbleSort(array);
        assertArrayEquals(arrayExpected,array );
    }
}
