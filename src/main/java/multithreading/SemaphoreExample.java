package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Zaur", callBox);
        new Person("Oleg", callBox);
        new Person("Elena", callBox);
        new Person("Viktor", callBox);
        new Person("Marina", callBox);
    }
}


class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start(); // при создании Person поток сразу запускается
    }

    @Override
    public void run() {
        try {
            System.out.println(name + "ждёт");
            callBox.acquire();
            System.out.println(name + " пользуется таксофоном");
            sleep(2000);
            System.out.println(name + "завершил(а) звонок");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }

    }
}
