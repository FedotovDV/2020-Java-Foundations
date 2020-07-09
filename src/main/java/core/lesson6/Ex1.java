package core.lesson6;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
//        List<ArrayList> arrayLists = new ArrayList<ArrayList>();
//        ArrayList<List> arrayList = new ArrayList<ArrayList>();
//        инвариантность

        Map<String,String> map = new HashMap<>(); //LinkedHashSet
//      Map map = new TreeMap(); Exception in thread "main" java.lang.NullPointerException
        map.put(null,  "null"); // ошибки нет!
        map.put(null,  "null2");// ошибки нет!
        System.out.println("map.get(null) = " + map.get(null));
        List<Integer> integerList = Arrays.asList(1, 2, 3);

        Set<Integer> hashSet = new HashSet<>(integerList);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(integerList);
        Set<Integer> treeSet = new TreeSet<>(integerList);
        System.out.println("hashSet.equals(linkedHashSet) = " + hashSet.equals(linkedHashSet));
        System.out.println("linkedHashSet.equals(treeSet) = " + linkedHashSet.equals(treeSet));
        System.out.println("hashSet.equals(treeSet) = " + hashSet.equals(treeSet));

        Gen<?> gen = new Gen(); //Raw type
        gen.m(integerList);
    }

    static class Gen<T> {
        <T> void m(Collection<T> collection) {
            for (T s : collection) {
                System.out.println(s);
            }
        }

        <T> void m(List<String> list) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
