package multithreading;

public class Example9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());//NEW
        thread.start();
        System.out.println(thread.getState());//RUNNABLE
        Thread.sleep(1000);
        System.out.println(thread.getState());//TIMED_WAITING
        thread.join(4500);
        System.out.println(thread.getState());//TERMINATED
        System.out.println("Method main ends");
    }
}


class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}