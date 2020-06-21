package core.lesson2_1;

import java.util.Arrays;

public class MergeArrays {

//    Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.
//
//    Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
//
//    К сожалению, автоматически это не проверить, так что это остается на вашей совести :)
//
//    Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//    Пример ввода: {0, 2, 2} и {1, 3}
//    Пример вывода: {0, 1, 2, 2, 3}
//
//    Требования:
//    Cигнатура метода должна быть: mergeArrays(int[] a1, int[] a2)

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2, 6}, new int[]{1, 3})));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] tempArray = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a1.length || j < a2.length) {
            if (i >= a1.length) {
                tempArray[k++] = a2[j++];
            } else if (j >= a2.length) {
                tempArray[k++] = a1[i++];
            } else if (a1[i] < a2[j]) {
                tempArray[k++] = a1[i++];
            } else {
                tempArray[k++] = a2[j++];
            }
        }
        return tempArray;
    }
}
