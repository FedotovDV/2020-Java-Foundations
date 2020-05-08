package recursion;


import org.junit.*;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;
import static recursion.TriangleApp.triangle;

public class TriangleAppTest {

    @Test
    public void testTriangle() {
        int theNumber1 = 1;
        int theNumber2 = 5;
        assertEquals(triangle(theNumber1), 1);
        assertEquals(triangle(theNumber2), ((theNumber2 + 1) / 2) * theNumber2);
    }
}