package recursion;

import java.util.Arrays;

/*
from
Роберт Лафорте Структуры данных и адгоритмы
*/
public class BinarySearchApp {


    private int[] ordArray;
    // number of data items
    private int size;

    public BinarySearchApp(int max) {
        ordArray = new int[max];
        size = 0;
    }

    public BinarySearchApp(int max, int[] values){
        ordArray = new int[max];
        size = 0;
        for(int value: values){
            insert(value);
        }
    }

    public int[] getArray() {
        return Arrays.copyOf(ordArray, size);
    }


    public int size() {
        return size;
    }

    public int find(int searchKey) {
        return recFind(searchKey, 0, size - 1);
    }

    private int recFind(int searchKey, int lowerBound, int upperBound) {
        int currentIndex;
        currentIndex = (lowerBound + upperBound) / 2;
        if (ordArray[currentIndex] == searchKey) {
            //элемент найден
            return currentIndex;
        } else if (lowerBound > upperBound) {
            //элемент не найден
            return -1;
        } else {
            if (ordArray[currentIndex] < searchKey) {
                // в верхней половине
                return recFind(searchKey, currentIndex + 1, upperBound);
            } else {
                // в нижней половине
                return recFind(searchKey, lowerBound, currentIndex - 1);
            }
        }
    }

    //Сохранение элемента в массиве
    public void insert(int value) {
        int i;
        for (i = 0; i < size; i++) {
            //Определение позиции( линейный поиск)
            if (ordArray[i] > value) {
                break;
            }
        }           // Перемещение элементов с больщим значением ключа
        for (int j = size; j > i; j--) {
            ordArray[j] = ordArray[j - 1];
        }
        // Вставка и увеличение размера
        ordArray[i] = value;
        size++;
    }


    //Вывод содержимого массива
    public void display() {
        for (int element : getArray()) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

}
