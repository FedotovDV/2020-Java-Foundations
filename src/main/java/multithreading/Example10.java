package multithreading;

public class Example10 {
    public static void main(String[] args) {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();


    }

}

class Counter {
    volatile static int counter = 0;
}

class MyRunnableImpl1 implements Runnable {

    public synchronized void increment() {
        Counter.counter++;
        System.out.print(Counter.counter + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
