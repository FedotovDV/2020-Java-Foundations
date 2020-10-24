package multithreading;

public class Example5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        MyThread5 myThread6 = new MyThread5();
        myThread5.setName("min_thread");
        myThread5.setPriority(Thread.MIN_PRIORITY);
        myThread6.setName("max_thread");
        myThread6.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThreads5 = " + myThread5.getName() +
                "\nPriority of myThread5 = " + myThread5.getPriority());
        System.out.println("Name of myThreads5 = " + myThread6.getName() +
                "\nPriority of myThread5 = " + myThread6.getPriority());
        System.out.println("*********************************");
        myThread5.start();
        myThread6.start();
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println( Thread.currentThread().getName() + ", privet");
    }
}
