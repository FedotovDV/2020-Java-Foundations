package exceptions;

import interfaces.Cat;

public class ExceptionRuner {
    public static void main(String[] args) {
//        try {
//            Cat cat = new Cat();
//            cat = null;
//            cat.toString();
//        } catch (Exception exc) {
//            throw new ExceptionInInitializerError();
//        } finally {
//            int x = 1;
//            System.out.println(x = 5 / 0);
//            System.out.println("Finally 1st try");
//        }
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        at exceptions.ExceptionRuner.main(ExceptionRuner.java:15)
        */

        Man alexandr = new Man("Alexandr", 10);
        try {
            alexandr.setAge(-5);
        } catch (MyNewException exc) {
            System.err.println("Bad age ");
            exc.getMessage();
            exc.printStackTrace();
        } finally {
            System.out.println("Finally 1st try");
        }

        Woman mariya = new Woman("Mariya", 30);
        try {
            mariya.setWeight(105);
        } catch (MyNewRuntimeException re) {
            re.printStackTrace();
        }
    }


}
