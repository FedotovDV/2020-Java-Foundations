package core.lesson2_1;

import java.util.Arrays;

public class EvenArray {

//    Напишите метод evenArray который принимает целое число типа int и возвращает массив заполненный четными числами от 1 до этого числа.
//    Пример ввода: 8
//    Пример вывода: [2,4,6,8]
//
//    Требования:
//            1. Метод должен быть публичным.
//            2. Параметр должен иметь тип int.
//            3. Сигнатура метода должна быть: evenArray(int number)

    public static void main(String[] args) {
        EvenArray evenArray = new EvenArray();

        System.out.println(Arrays.toString(evenArray.evenArray(8)));
    }

    public int[] evenArray(int number) {
        if (number <= 0) {
            return new int[0];//throw new MyRuntimeException("Wrong parameter!")
        }
        int index = 0;
        int[] tempArray = new int[number / 2];
        for (int i = 2; i <= number; i += 2) {
            tempArray[index] = i;
            index++;
        }
        return tempArray;
    }
}
