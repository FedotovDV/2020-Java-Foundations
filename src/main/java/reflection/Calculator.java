package reflection;

public class Calculator {
    void sum(int a, int b){
        int result = a + b;
        System.out.println("Сумма "+ a + " и " + b + " = " + result);
    }

    void substraction(int a, int b){
        int result = a - b;
        System.out.println("Разница "+ a + " и " + b + " = " + result);
    }
    void multiplication(int a, int b){
        int result = a * b;
        System.out.println("Произведение "+ a + " и " + b + " = " + result);
    }
    void division(int a, int b){
        int result = a / b;
        System.out.println("Частное "+ a + " и " + b + " = " + result);
    }
}
