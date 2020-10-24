package multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    volatile static int counter = 0;
}

class MyRunnableImpl2 implements Runnable {
    public void doWork1() {
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            Counter2.counter++;
            System.out.println(Counter2.counter + " " + Thread.currentThread().getName());
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}

