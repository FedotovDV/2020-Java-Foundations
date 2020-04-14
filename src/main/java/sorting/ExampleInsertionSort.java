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
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            int key = arrayOfNumbers[i];
            int j = i - 1;
            while (j >= 0 && key < arrayOfNumbers[j]) {
                arrayOfNumbers[j + 1] = arrayOfNumbers[j];
                j--;
            }
            arrayOfNumbers[j + 1] = key;
        }
    }

    private static void printSortArray(int[] myArray) {
        for (int value : myArray) System.out.print(value + " ");
    }
}
