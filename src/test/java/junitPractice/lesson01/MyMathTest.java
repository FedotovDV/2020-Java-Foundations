package junitPractice.lesson01;

import junitPractice.lesson01.MyMath;
import org.junit.Test;
public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void zeroDividedShouldThrowException() {
        MyMath.divide(1, 0);
    }
}
