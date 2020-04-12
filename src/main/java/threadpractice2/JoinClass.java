package threadpractice2;

import java.util.Calendar;

public class JoinClass implements Runnable {

    @Override
    public void run() {
        System.out.println("JoinClass.run() " + Calendar.getInstance().getTime());
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("afterSleep " + Calendar.getInstance().getTime());
    }
}