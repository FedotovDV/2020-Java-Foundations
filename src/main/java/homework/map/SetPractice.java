package homework.map;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

//        1. Создать множество.
        Set<Fruit> basketFruit = new HashSet<>();

//        2. Добавить элемент. Добавить дубликат.
        basketFruit.add(new Fruit("Арбуз", 10));
        basketFruit.add(new Fruit("Арбуз", 10));
        basketFruit.add(new Fruit("Апельсин", 3));
        basketFruit.add(new Fruit("Яблоко", 1));

//
//        3. Удалить элемент из множества.
        basketFruit.remove(new Fruit("Апельсин", 3));

        for (Fruit fruit : basketFruit) {
            System.out.println(fruit.toString());
        }
    }
}
