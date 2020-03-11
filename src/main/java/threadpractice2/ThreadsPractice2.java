package threadpractice2;



public class ThreadsPractice2 {
    public static void main(String[] args) throws InterruptedException {

        ThreadsPractice2 threadsPractice1 = new ThreadsPractice2();
        ThreadsPractice2 threadsPractice2 = new ThreadsPractice2();
        ThreadsPractice2 threadsPractice3 = new ThreadsPractice2();
        MyThread thread1 = new MyThread(1, threadsPractice1);
        MyThread thread2 = new MyThread(2, threadsPractice1);
        MyThread thread3 = new MyThread(3, threadsPractice1);


        thread1.start();
        thread2.start();
        thread3.start();
        Thread.sleep(1000);
        synchronized (threadsPractice1){
            threadsPractice1.notifyAll();
        }

//        SynchCar synchCar = new SynchCar();
//        synchCar.print();


//        final Object obj;
//        obj = new Object();
//       synchronized (obj){
//           obj.wait();
//       }

//        synchronized (obj){
////            synchronized (new Object()){
////                obj.wait();
////            }
////        }

    }

    public synchronized void printRun(int key) throws InterruptedException {
        System.out.println("b :" + key);
//        Thread.sleep(1000);
//        this.notify();
        this.wait();
        System.out.println("e: " + key);
    }
}
