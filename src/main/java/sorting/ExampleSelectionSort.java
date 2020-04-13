package sorting;

public class ExampleSelectionSort {
    public static void main(String[] args) {

        int[] myArray = {3, 6, 1, 7, 2, 8, 10, 6, 4, 9, 5, -1, 0};
        System.out.println("\nArray before sorting:");
        printSortArray(myArray);
        selectionSort(myArray);
        System.out.println("\nArray after sorting:");
        printSortArray(myArray);
    }

    public static void selectionSort(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++)
            swapNumbers(arrayOfNumbers, i, getMin(arrayOfNumbers, i));
    }

    public static int getMin(int[] arrayOfNumbers, int minIndex) {
        int minId = minIndex;
        for (int i = minIndex + 1; i < arrayOfNumbers.length; i++)
            if (arrayOfNumbers[i] < arrayOfNumbers[minId])
                minId = i;
        return minId;
    }

    public static void swapNumbers(int[] arrayOfNumbers, int i, int j) {
        int temp = arrayOfNumbers[i];
        arrayOfNumbers[i] = arrayOfNumbers[j];
        arrayOfNumbers[j] = temp;
    }

    private static void printSortArray(int[] myArray) {
        for (int value : myArray) System.out.print(value + " ");
    }
}
