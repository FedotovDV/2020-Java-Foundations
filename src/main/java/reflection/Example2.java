package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException,
            NoSuchMethodException, InvocationTargetException {

        Class employeeClass = Class.forName("reflection.Employee");
        //Deprecated in Java11
        Employee o = (Employee)employeeClass.newInstance();

        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Zaur", "IT");

        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 800.88);

        System.out.println(obj2);


    }
}
