package junitPractice.lesson04;

import java.util.List;

public class LinkedVsArrayList {

    public static void remove(List<String> list,String element){
        System.out.print(list.getClass().getSimpleName() + " :\t");
        long start = System.nanoTime();
        list.remove(element);
        long stop = System.nanoTime();
        System.out.println("took "+ ((double)(stop - start))/1000000 + " milliseconds.");
    }
}
