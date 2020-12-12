package junitPractice.lesson01;

import junitPractice.lesson01.Vector2D;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();
        System.out.println("Method BeforeClass");
    }

//    private Vector2D v1;
//
//    @Before
//    public void createNewVector() {
//        v1 = new Vector2D();
//        System.out.println("Method Before");
//    }

    @Test
    public void newVectorShouldHaveZeroLength() {
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Assert.assertEquals(0, v1.getY(), EPS);
    }
}
