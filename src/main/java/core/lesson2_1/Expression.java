package core.lesson2_1;

public class Expression {

    //    Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
//    Допустимая погрешность – 0.0001 (1E-4)
//    Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
//    В качестве примера написано заведомо неправильное выражение. Исправьте его.
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.1, 1.0));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(c - (a + b)) < 0.0001;
    }
}
