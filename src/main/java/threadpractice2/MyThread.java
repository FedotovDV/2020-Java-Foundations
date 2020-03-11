package threadpractice2;

public class MyThread extends Thread {
    private int key;
    private ThreadsPractice2 threadPractice;

    public MyThread(int key, ThreadsPractice2 threadPractice) {
        this.key = key;
        this.threadPractice = threadPractice;
    }

    @Override
    public void run() {
        try {
            threadPractice.printRun(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
