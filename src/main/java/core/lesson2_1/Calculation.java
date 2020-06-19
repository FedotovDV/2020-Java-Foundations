package core.lesson2_1;

public class Calculation {
    //    Напишите публичный метод priceCalculation, который считает стоимость товара.
//    В метод передается цена товара (может быть дробной) и количество товара, метод должен возвращать итоговую цену покупки.
//
//    Пример ввода: 8.50, 2
//    Пример вывода: 17.0
    public static void main(String[] args) {
        System.out.println(priceCalculation(8.50, 2));
    }

    public static double priceCalculation(double price, int count) {
//        double result = price * count;
        return price * count;
    }
}
