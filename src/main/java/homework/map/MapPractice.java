package homework.map;


import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        System.out.println("Создадим экземпляр HashMap");
        Map<String, Fruit> basketFruit = new HashMap<>();

        System.out.println("\nДобавим 5 элементов");
        basketFruit.put("watermelon1", new Fruit("Арбуз", 10));
        basketFruit.put("apple1", new Fruit("Яблоко", 1));
        basketFruit.put("watermelon2", new Fruit("АрБуз", 24));
        basketFruit.put("apple2", new Fruit("ЯблоКо", 2));
        basketFruit.put("watermelon3", new Fruit("АрбуЗ_", 30));

        System.out.println("\nВ новый экзмепляр Map добавим старую карту.");
        Map<String, Fruit> shopFruit = new HashMap<>(basketFruit);
        shopFruit.put("orange1", new Fruit("Апельсин", 3));
        shopFruit.put("pear1", new Fruit("Груша", 2));


        System.out.println("\nУдалим фрукт apple1.");
        basketFruit.remove("apple1");

        System.out.println("\nПроверка на наличие ключ и значение");
        System.out.println("shopFruit.containsKey(\"apple1\") = " + shopFruit.containsKey("apple1"));

        System.out.println("\nВывести все ключи из basketFruit");
        for (String key : basketFruit.keySet()) {
            System.out.println(key);
        }
        System.out.println("\nВывести все значения из basketFruit");
        for (Fruit fruit : basketFruit.values()) {
            System.out.println(fruit);
        }
        System.out.println("\nВывести все ключи и значения с помощью entrySet из shopFruit");
        for (Map.Entry<String, Fruit> fruitEntry : shopFruit.entrySet()) {
            System.out.println(fruitEntry.getKey());
            System.out.println(fruitEntry.getValue());
        }

        int countKey = 0;
        for (String key : shopFruit.keySet()) {
            if (key.length() > 5) {
                countKey++;
            }
        }
        System.out.println("\nКоличество ключей длина которых больше 6 = " + countKey);

        int countValue = 0;
        for (Fruit fruit : shopFruit.values()) {
            if (fruit.getName().equalsIgnoreCase("арбуз")) {
                countValue++;
            }
        }
        System.out.println("\nКоличество элементов, которые равны \"арбуз\" " + countValue);


        System.out.println("\nПропустить 2 элемента, значения которых Арбуз, все остальные вывести.");
        int count = 0;
        for (Map.Entry<String, Fruit> fruitEntry : shopFruit.entrySet()) {
            Fruit fruit = fruitEntry.getValue();
            if ((fruit.getName().equalsIgnoreCase("арбуз") && (count < 2))) {
                count++;
            } else {
                System.out.println(fruitEntry.getKey() + " <=> " + fruitEntry.getValue());
            }
        }

        System.out.println("\nВывести все кроме 2 элементов, ключи которых начинаются на А.");
        count = 0;
        for (Map.Entry<String, Fruit> fruitEntry : shopFruit.entrySet()) {
            if ((fruitEntry.getKey().charAt(0) == 'a') && (count < 2)) {
                count++;
            } else {
                System.out.println(fruitEntry.getKey() + " <=> " + fruitEntry.getValue());
            }
        }
        System.out.println("\nВозращаем элемент значение которого арбуз или Арбуз или АРбУз_.");
        for (Map.Entry<String, Fruit> fruitEntry : shopFruit.entrySet()) {
            String fruit = fruitEntry.getValue().getName().replaceAll("[\\s\\p{Punct}]", "");
            if (fruit.equalsIgnoreCase("арбуз")) {
                System.out.println(fruitEntry.getKey() + " <=> " + fruitEntry.getValue());
            }
        }

        System.out.println("\nВозвращаем все элементы в другую карту, которые являются фруктами.");
        Map<String, Fruit> onlyFruit = new HashMap<>();
        for (Map.Entry<String, Fruit> fruitEntry : shopFruit.entrySet()) {
            String fruit = fruitEntry.getValue().getName().replaceAll("[\\s\\p{Punct}]", "");
            if (!fruit.equalsIgnoreCase("арбуз")) {
                System.out.println(fruitEntry.getKey() + " <=> " + fruitEntry.getValue());
                onlyFruit.put(fruitEntry.getKey(), fruitEntry.getValue());
            }
        }
        count = 0;
        int allWaith = 0;
        for (Fruit fruit : onlyFruit.values()) {
            allWaith += fruit.getWaith();
            count++;
        }
        System.out.println("\nCредний вес всех фруктов = "+ allWaith/count );


    }
}
