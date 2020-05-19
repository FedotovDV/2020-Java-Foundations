package recursion;


import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;


public class BinarySearchAppTest {

    private BinarySearchApp ordArray;
    private int maxSize;

    @Before
    public void before() {
        maxSize = 100;
        ordArray = new BinarySearchApp(maxSize);
    }


    @Test
    public void testInsert() {
        ordArray.insert(72);
        ordArray.insert(90);
        ordArray.insert(45);
        ordArray.insert(126);
        ordArray.insert(54);
        ordArray.insert(99);
        ordArray.insert(144);
        ordArray.insert(27);
        ordArray.insert(135);
        ordArray.insert(81);
        ordArray.insert(18);
        ordArray.insert(108);
        ordArray.insert(9);
        ordArray.insert(117);
        ordArray.insert(63);
        ordArray.insert(36);
        Assert.assertArrayEquals(new int[]{9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99, 108, 117, 126, 135, 144}, ordArray.getArray());
    }


}
