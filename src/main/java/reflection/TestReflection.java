package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //название_класса_1 название_класса_2 название_метода
            // reflection.Person java.lang.String setName
            //java.lang.Thread java.lang.String setName
            Class classObject1 = Class.forName(scanner.next());
            Class classObject2 = Class.forName(scanner.next());
            String method = scanner.next();

            Method someMethod = classObject1.getMethod(method, classObject2);
            Object obj1 = classObject1.getConstructor().newInstance();
            Object obj2 = classObject2.getConstructor(String.class).newInstance("String value");
            someMethod.invoke(obj1, obj2);
            System.out.println(obj1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
