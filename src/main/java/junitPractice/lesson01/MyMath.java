package junitPractice.lesson01;

public class MyMath {
    public static double divide(int dividend, int divisor){
        if(divisor == 0){
            throw new ArithmeticException("Can't divide by zero");
        }
        return dividend/divisor;
    }
}
