package sorting;

public class ExampleMergeSort {
    public static void main(String[] args){
        int[] myArray = {3, 6, 1, 7, 2, 8, 10, 6, 4, 9, 5, -1, 0};
        System.out.println("\nArray before sorting:");
        printSortArray(myArray);
        mergeSort(myArray, 0, myArray.length-1);
        System.out.println("\nArray after sorting:");
        printSortArray(myArray);
    }
/*
from
https://webexsite.wordpress.com
 */
    public static void mergeSort(int[] elements, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(elements, low, mid);
            mergeSort(elements, mid + 1, high);
            merge(elements, low, mid, high);
        }
    }

    private static void merge(int[] subset, int low, int mid, int high) {

        int n = high-low+1;
        int[] Temp = new int[n];

        int i = low, j = mid + 1;
        int k = 0;

        while (i <= mid || j <= high) {
            if (i > mid)
                Temp[k++] = subset[j++];
            else if (j > high)
                Temp[k++] = subset[i++];
            else if (subset[i] < subset[j])
                Temp[k++] = subset[i++];
            else
                Temp[k++] = subset[j++];
        }
        for (j = 0; j < n; j++)
            subset[low + j] = Temp[j];
    }



    private static void printSortArray(int[] myArray) {
        for (int value : myArray) System.out.print(value + " ");
    }
}
