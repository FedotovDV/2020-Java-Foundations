package collections.listPractice;

import objectPractice.Cake;

import java.util.*;

public class MyListRunner {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add(new Cake("Эклер", 2.0, true));
        System.out.println("list.size() = " + list.size());
        list.add(new Cake("Неэклер", 1.0, false));
        System.out.println("list.size() = " + list.size());
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Неэклер", 1.0, false));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Неэклер", 1.0, false));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        list.add(new Cake("Суперэклер", 3.0, true));
        System.out.println("list.indexOf(new Cake(\"Неэклер\", 1.0, false)) = " + list.indexOf(new Cake("Неэклер", 1.0, false)));
        System.out.println("list.lastIndexOf(new Cake(\"Неэклер\", 1.0, false)) = " + list.lastIndexOf(new Cake("Неэклер", 1.0, false)));
        list.add(new Cake("Суперэклер", 3.0, true));
        System.out.println("list.size() = " + list.size());
        System.out.println("list.toString() = " + list.toString());
        list.remove(3);
        System.out.println("list.remove(3);");
        System.out.println("list.toString() = " + list.toString());
        list.remove(new Cake("Неэклер", 1.0, false));
        System.out.println("list.remove(\"Неэклер\")");
        System.out.println("list.toString() = " + list.toString());
        list.add(5, new Cake("Неэклер", 1.0, false));
        System.out.println("list.add(5,new Cake)");
        System.out.println("list.get(5) = " + list.get(5));
        System.out.println("list.toString() = " + list.toString());
        list.clear();
        System.out.println(" list.clear()");
        System.out.println("list.toString() = " + list.toString());


    }
}
