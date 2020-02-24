package collections.listPractice.myLinkedList;

import collections.listPractice.myLinkedList.MyLinkedList;

import java.util.Arrays;

public class MyLinkedListRunner {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(0, 7);
        System.out.println("myLinkedList.indexOf(5) = " + myLinkedList.indexOf(5));
        System.out.println("myLinkedList.indexOf(7) = " + myLinkedList.indexOf(7));
        System.out.println("myLinkedList.set(2, 7)");
        myLinkedList.set(2, 7);
        System.out.println(Arrays.toString(myLinkedList.toArray()));
        System.out.println("myLinkedList.lastIndexOf(7) = " + myLinkedList.lastIndexOf(7));
        System.out.println("myLinkedList.get(3).getValue() =" + myLinkedList.get(3).getValue());
        myLinkedList.remove((Integer) 6);
        myLinkedList.remove(0);
        System.out.println(myLinkedList.toString());
        System.out.println(Arrays.toString(myLinkedList.toArray()));
        System.out.println("myLinkedList.clear()");
        myLinkedList.clear();
        System.out.println(Arrays.toString(myLinkedList.toArray()));

    }
}
