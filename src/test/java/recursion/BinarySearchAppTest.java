package recursion;


import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BinarySearchAppTest {

    private BinarySearchApp ordArray;
    private int maxSize;

    @Before
    public void before() {
        maxSize = 100;
        ordArray = new BinarySearchApp(maxSize, new int[]{72, 90, 45, 126, 54, 99, 144, 27, 135, 81, 18, 108, 9, 117, 63, 36});
    }


    @Test
    public void testInsert() {
        Assert.assertArrayEquals(new int[]{9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99, 108, 117, 126, 135, 144}, ordArray.getArray());
        ordArray.insert(66);
        Assert.assertArrayEquals(new int[]{9, 18, 27, 36, 45, 54, 63, 66, 72, 81, 90, 99, 108, 117, 126, 135, 144}, ordArray.getArray());

    }

    @Test
    public void testFind() {
        Assert.assertEquals(2, ordArray.find(27));
        Assert.assertEquals(-1, ordArray.find(25));
    }


}
