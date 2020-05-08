package recursion;
import org.junit.*;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;
import static recursion.FactorialApp.factorial;

public class FactorialAppTest {

    @Test
    public void testFactorial() {
        int theNumber1 = 0;
        int theNumber2 = 6;
        assertEquals(factorial(theNumber1), 1);
        assertEquals(factorial(theNumber2), 720);
    }
}