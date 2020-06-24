package core.lesson4;

public class Test {

//    Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
//    Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.
//    Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод, откуда сообщение было залогировано.

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();
    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();
    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();
    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());
    }


    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        return (stackTrace.length > 2) ? (stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName()) : null;

    }
}