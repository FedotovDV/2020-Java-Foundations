package multithreading;

public class Example8 extends Thread {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread((new MyRunnable1()));
        Example8 thread2 = new Example8();
        thread1.setName("minPriorityThread");
        thread2.setName("maxPriorityThread");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("End main");

    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }


}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
