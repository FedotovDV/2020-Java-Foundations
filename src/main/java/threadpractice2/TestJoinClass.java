package threadpractice2;

import java.util.Calendar;

public class TestJoinClass {
    public static void main(String[] args) {
        Thread threadExample = new Thread(new JoinClass());
        threadExample.start();
        try {
            threadExample.join(); //public static void TestClass.main() connect to threadExample and wait for it.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END: " + Calendar.getInstance().getTime());
    }
}