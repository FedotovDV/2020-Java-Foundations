package threadpractice2;

public class SynchCar {

    public synchronized void print() throws InterruptedException {
        System.out.println("Print");
        this.wait();
    }
}
