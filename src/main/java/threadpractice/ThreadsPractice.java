package threadpractice;

public class ThreadsPractice {
    public static void main(String[] args) throws InterruptedException {
//        for (int k = 0; k < 10; k++) {
////            for (int i = 0; i < 1_000_000_000L; i++) {
////            }
//            Thread.sleep(250);
//            System.out.println("S1");
//        }
//
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(300);
//            System.out.println("S2");
//        }
        System.out.println("Start");
        Runnable printer = new Printer("S1", 300);
        Thread thread = new Thread(printer);
        thread.start();

        System.out.println("Other cycle");
        for (int k = 0; k < 10; k++) {
            Thread.sleep(250);
            System.out.println("S2");
        }
        thread.join();

        System.out.println("END");


//         Deadlock!
//        Thread.currentThread().join();

        //анонимный класс
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Vitalik");
//            }
//        };
//        Thread t = new Thread(runnable);
//        t.start();
//
//        Thread t2 = new Thread(() -> {
//            System.out.println("Yo!");
//            System.out.println("Vitalik");
//        });
//        t2.start();
//
//        new Thread(() -> {
//            System.out.println("Yo!");
//            System.out.println("Vitalik");
//        }).start();
    }
}
