package multithreading;

import lombok.SneakyThrows;

public class DeadLockExample {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }

}

class Thread10 extends Thread{
    @SneakyThrows
    public void run(){
        System.out.println("Thread10: попытка захватить монитор объекта lock1");
        synchronized(DeadLockExample.lock1){
            System.out.println("Thread10: монитор объекта lock1 захвачен");
            Thread.sleep(3000);
            System.out.println("Thread10: попытка захватить монитор объекта lock2");
            synchronized(DeadLockExample.lock2){
                System.out.println("Thread10: мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread{
    @SneakyThrows
    public void run(){
        System.out.println("Thread10: попытка захватить монитор объекта lock2");
        synchronized(DeadLockExample.lock2){
            System.out.println("Thread20: монитор объекта lock2 захвачен");
            Thread.sleep(3000);
            System.out.println("Thread20: попытка захватить монитор объекта lock1");
            synchronized(DeadLockExample.lock1){
                System.out.println("Thread20: мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}

