package homework.thread;



public class ThreadsRunner {

    public static void main(String[] args) {
//        2. Потоки. Создать разными способами потоки. Через Thread, Runnable.
//        3. Написать программу, которая выводит любое сообщение раз в 5 секунд.

        Thread thread1 = new MyThreads("Hello, World!");
        Thread thread2 = new Thread(new MyRunnable("Hello, Java!"));
        thread1.start();
        thread2.start();

    }
}
