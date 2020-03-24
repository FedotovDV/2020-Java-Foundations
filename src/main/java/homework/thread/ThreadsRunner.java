package homework.thread;



public class ThreadsRunner {

    public static void main(String[] args) {
//        2. Потоки. Создать разными способами потоки. Через Thread, Runnable.
//        3. Написать программу, которая выводит любое сообщение раз в 5 секунд.

        Thread thread1 = new MyThreads("Hello, World!");
        Thread thread2 = new Thread(new MyRunnable("Hello, Java!"));
        thread1.start();
        thread2.start();
/*

if use   TimeUnit.SECONDS.sleep(2); and (5)
or Thread.sleep(millis); 2000 and 5000
Hello, World!
Hello, World!
Hello, Java!
Hello, World!
Hello, World!
Hello, Java!
Hello, World!
Hello, World!
Hello, World!
Hello, Java!
Hello, World!
Hello, World!
Hello, Java!
Hello, World!
Hello, Java!
Hello, Java!
Hello, Java!
Hello, Java!
Hello, Java!
Hello, Java!

 */
    }
}
