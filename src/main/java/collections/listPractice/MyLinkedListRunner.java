package collections.listPractice;

import java.util.LinkedList;

public class MyLinkedListRunner {
    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        System.out.println(myLinkedList.get(3).getValue());
//        myLinkedList.remove((Integer) 5);
        myLinkedList.remove(0);
        System.out.println(myLinkedList.toString());
        myLinkedList.clear();
        System.out.println(myLinkedList.toString());

    }
}
