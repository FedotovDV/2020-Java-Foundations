package threadpractice2;

public class TestInterruptedClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new InterruptedClass());
        thread.start();
        try {
            Thread.sleep(500L); // выключаем поток main, чтобы в JoinClass.run() что-то успело посчитаться
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}