package junitPractice.lesson04;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedVsArrayListTest {

    private static List<String>  arrayList;
    private static List<String> linkedList;

    @BeforeClass
    public static void setUpBeforeClass(){
        arrayList = new ArrayList<>();
        for(int i=0; i<10_000_000; i++){
            arrayList.add("" + i);
        }
        linkedList = new LinkedList<>(arrayList);
    }

    @Test(timeout = 100)
//    @Ignore(value = "Removal on ArrayList takes too long"
//    + " so we disable it for the time being")
    public void testRemovalArrayList(){
        LinkedVsArrayList.remove(arrayList,"9555555");
    }
    @Test(timeout = 100)
    public void testRemovalLinkedList(){
        LinkedVsArrayList.remove(linkedList,"9555555");
    }

}
