package sorting;

public class ExampleInsertionSort {
    public static void main(String[] args) {

        int[] myArray = {3, 6, 1, 7, 2, 8, 10, 6, 4, 9, 5, -1, 0};
        System.out.println("\nArray before sorting:");
        printSortArray(myArray);
        insertionSort(myArray);
        System.out.println("\nArray after sorting:");
        printSortArray(myArray);
    }
    private static void insertionSort(int[] arrayOfNumbers) {
        for (int i = 1; i < arrayOfNumbers.length; i++) { //i - это разделительный маркер
            int key = arrayOfNumbers[i];                  // скопировать помеченный элемент
            int j = i - 1;                                // начать перемещение с i
            while (j >= 0 && key < arrayOfNumbers[j]) {   // пока не найден меньший элемент
                arrayOfNumbers[j + 1] = arrayOfNumbers[j]; // сдвинуть элемент вправо
                j--;                                       // перейти на одну позицию влево
            }
            arrayOfNumbers[j + 1] = key;                   // вставить помеченый элемент
        }
    }

    private static void printSortArray(int[] myArray) {
        for (int value : myArray) System.out.print(value + " ");
    }
}
