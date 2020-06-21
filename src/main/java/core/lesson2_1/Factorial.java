package core.lesson2_1;

import java.math.BigInteger;

public class Factorial {

//    Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
//    Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
//    Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
//    Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
//
//    Пример ввода 1: 1
//    Пример возвращаемого значения 1: 1
//
//    Пример ввода 2: 3
//    Пример возвращаемого значения 2: 6
//    Требования:
//            1. Метод должен быть public.
//            1. Метод должен быть static.
//            3. Передаваемый параметр должен иметь тип int.
//            4. Метод должен быть реализован через цикл.

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        if (value == 0) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }

    public static BigInteger factorialFor(int value) {
        if (value == 0) {
            return BigInteger.valueOf(1);
        }
        BigInteger result = BigInteger.valueOf(value);
        for (int i = value - 1; i > 1; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
