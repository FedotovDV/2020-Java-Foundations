package core.lesson2_1;

public class OddNumbers {


    //    Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.
//    Пример ввода: [3,5,20,8,7,3,100]
//    Пример вывода: 3,5,7,3
//
//
//    Требования:
//    Сигнатура метода должна быть: printOddNumbers(int[] arr)

    public static void main(String[] args) {
        printOddNumbers(new int[]{2, 4, 6, 7});
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder oddNumbers = new StringBuilder();
        for (int number : arr) {
            if (!(number % 2 == 0)) {
                oddNumbers.append(number);
                oddNumbers.append(',');
            }
        }
        if (oddNumbers.length() > 0) {
            oddNumbers.deleteCharAt(oddNumbers.length() - 1);
        }
        System.out.println(oddNumbers.toString());
    }
}


