package collection.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionExample2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        List<Integer> synchronizedList =
                Collections.synchronizedList(arrayList);
        //Exception in thread "Thread-0" java.util.ConcurrentModificationException
        Runnable runnable1 = ()->{
            synchronized(synchronizedList) {
                Iterator<Integer> iterator = synchronizedList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        };
        Runnable runnable2 = ()-> synchronizedList.remove(10);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronizedList);
    }
}
