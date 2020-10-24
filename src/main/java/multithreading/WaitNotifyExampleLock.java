package multithreading;

public class WaitNotifyExampleLock {
    public static void main(String[] args) {
        Market1 market = new Market1();
        Producer1 producer = new Producer1(market);
        Consumer1 consumer = new Consumer1(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}


class Market1 {
    private int breadCount = 0;
    static final Object lock = new Object();

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount--;
            System.out.println("Потребитель купил 1 хлеб");
            System.out.println("Количество хлеба в машгазине = " + breadCount);
            lock.notify();
        }
    }

    public void putBread() {
        synchronized (lock) {
            while (breadCount > 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount++;
            System.out.println("Производитель добавил на витрину 1 хлеб");
            System.out.println("Количество хлеба в машгазине = " + breadCount);
            lock.notify();
        }
    }
}

class Producer1 implements Runnable {
    Market1 market;

    Producer1(Market1 market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer1 implements Runnable {
    Market1 market;

    Consumer1(Market1 market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
