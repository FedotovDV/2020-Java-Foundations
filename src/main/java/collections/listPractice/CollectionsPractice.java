package collections.listPractice;

import java.util.ArrayList;
import java.util.List;

public class CollectionsPractice {


    public static void main(String[] args) {

        System.out.println("Создать пустой список (Используя конструктор) :");
        List<Integer> arrayList1 = new ArrayList<>();
        System.out.println("arrayList1.size() = " + arrayList1.size());
        System.out.println("\nСоздать список размером 20 :");
        arrayList1 = new ArrayList<>(20);

        for (int i = 1; i < 21; i++) {
            arrayList1.add(i);
        }
        System.out.println("\nПолучить элемент по индексу :");
        System.out.println("arrayList.get(0) = " + arrayList1.get(0));
        System.out.println("\nПолучить последний элемент :");
        System.out.println("arrayList.get(arrayList.size()-1) = " + arrayList1.get(arrayList1.size() - 1));

        System.out.println("\nДобавить подряд 5 элементов.:");
        arrayList1.clear();
        for (int i = 0; i < 5; i++) {
            arrayList1.add(i + 1);
        }
        System.out.println("Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.:");
        arrayList1.add(2, 6);
        arrayList1.add(0, 7);
        System.out.println("Записать в новый список все элементы предыдущего списка.:");
        List<Integer> arrayList2 = new ArrayList<>(arrayList1);
        System.out.println("arrayList2.toString() = " + arrayList2.toString());

        System.out.println("\nУдалить элемент по значению:");
        arrayList1.remove((Integer) 5);
        System.out.println("Удалить элемент по индексу:");
        arrayList1.remove(5);
        System.out.println("arrayList1.toString() = " + arrayList1.toString());

        System.out.println("\nПроверить наличие элемента:");
        System.out.println("arrayList2.contains(5) = " + arrayList2.contains(5));

        System.out.println("\nВывести список на экран в формате: List: {\"First\";\"Second\";\"Third\"}");
        List<String> arrayList3 = new ArrayList<>();
        arrayList3.add("First");
        arrayList3.add("Second");
        arrayList3.add("Third");
        printArrayList(arrayList3);

        System.out.println("\nОтфильтровать список вернуть записи по некоторому условию:");
        System.out.println("Индекс делится на 3");
        for (int i = 0; i < arrayList2.size(); i++) {
            if ((i % 3) == 0) {
                System.out.println(i);
            }
        }


        arrayList3.add("First");
        int count = 0;
        for (String s : arrayList3) {
            if (s.equals("First")) {
                count++;
            }
        }
        System.out.println("\nKоличество элементов, которые равны 'First' =" + count);

        System.out.println("\nПропустить первые 3 элемента в списке :");
        arrayList1.clear();
        for (int i = 1; i < 7; i++) {
            arrayList1.add(i);
        }
        for (int i = 3; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }

        System.out.println("\nПропустить первые 2 элемента, которые равные 5 :");
        arrayList1.add(2, 5);
        arrayList1.add(0, 5);
        printArrayList(arrayList1);
        count = 0;
        for (Integer element : arrayList1) {
            if (element== 5 && count < 2) {
                count++;
            } else {
                System.out.println(element);
            }
        }

        System.out.print("\nПервый элемент делящийся на 3 :");
        for( Integer element :arrayList2){
        if ((element % 3) == 0) {
            System.out.println(element);
            break;
        }
    }

        System.out.println("\nВозвращаем все элементы делящиеся на 3 :");
        for(Integer element :arrayList2)  {
        if ((element % 3) == 0) {
            System.out.println(element);
        }
    }
//        10. Создать класс Person.
//                Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на Н
//
//        11. Найти средний возраст всех женщин.


}


    private static <T> void printArrayList(List<T> arrayList) {
        System.out.print("List: {");
        for (T t : arrayList) System.out.print("\"" + t + "\";");
        System.out.print("\b}\n");
    }

}
