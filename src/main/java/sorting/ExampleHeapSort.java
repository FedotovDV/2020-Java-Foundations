package sorting;

public class ExampleHeapSort {

    public static void main(String[] args) {
        int[] myArray = {3, 6, 1, 7, 2, 8, 10, 6, 4, 9, 5, -1, 0};
        System.out.println("\nArray before sorting:");
        printSortArray(myArray);
        heapsort(myArray);
        System.out.println("\nArray after sorting:");
        printSortArray(myArray);
    }
/*
from
https://habr.com/ru/company/otus/blog/460087/
 */
    private static void heapsort(int[] arrayOfNumbers)
    {
        int n = arrayOfNumbers.length;
        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arrayOfNumbers, n, i);
        // Один за другим извлекаем элементы из кучи
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = arrayOfNumbers[0];
            arrayOfNumbers[0] = arrayOfNumbers[i];
            arrayOfNumbers[i] = temp;
            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arrayOfNumbers, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
    private  static void heapify(int[] arrayOfNumbers, int n, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2
        // Если левый дочерний элемент больше корня
        if (l < n && arrayOfNumbers[l] > arrayOfNumbers[largest])
            largest = l;
        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arrayOfNumbers[r] > arrayOfNumbers[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i)
        {
            int swap = arrayOfNumbers[i];
            arrayOfNumbers[i] = arrayOfNumbers[largest];
            arrayOfNumbers[largest] = swap;
            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arrayOfNumbers, n, largest);
        }
    }

    private static void printSortArray(int[] myArray) {
        for (int value : myArray) System.out.print(value + " ");
    }

}