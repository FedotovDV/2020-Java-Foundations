package core.lesson2_1;

public class Counters {

//    IT Компания собрала новую команду программистов и закупает оборудование для их рабочих мест
//    Как известно, все программисты очень любят иметь как можно больше мониторов. Всем работникам надо выдать одинаковое количество мониторов (иначе они поссорятся).
//    Напишите программу, которая принимает на вход количество мониторов купленных компанией и количество программистов в ней, а возвращает количество мониторов, которые никому не достанутся.
//    Требования:1) Сигнатура метода содержит только примитивные типы размерностью в 32 бита
//2) Название метода должно быть drawisMonitorsCounter
//3) Метод должен быть виден из любого пакета
//4) Сигнатура метода должна быть: drawisMonitorsCounter(int monitors, int programmers)


    public static void main(String[] args) {
//        System.out.println(drawisMonitorsCounter(9, 10));
        System.out.println(charExpression(0));
    }

    public static int drawisMonitorsCounter(int monitors, int programmers) {
        if (programmers == 0) {
            return monitors;
        }
        return monitors % programmers;
    }

//    Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
//    В качестве примера написано заведомо неправильное выражение. Исправьте его.

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
