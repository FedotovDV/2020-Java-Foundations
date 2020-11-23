package reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCalculator {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/testCalculator"))) {
            String methodName = reader.readLine();
            String firstArgument = reader.readLine();
            String secondArgument = reader.readLine();

            Calculator calculator = new Calculator();
            Class calculatorClass = calculator.getClass();
            Method method = null;
            Method[] methods = calculatorClass.getDeclaredMethods();
            for (Method thisMethod : methods) {
                if (thisMethod.getName().equals(methodName)) {
                    method = thisMethod;
                }
            }
            method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
