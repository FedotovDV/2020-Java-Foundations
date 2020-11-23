package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class classEmployee = Class.forName("reflection.Employee");
        //варианты создания объекта класса Class
//        Class classEmpoyee2 = Employee.class;
//
//        Employee emp = new Employee;
//        Class classEmployee3 = emp.getClass();
        //  получение приватного поля
//        Field someField = classEmployee.getDeclaredField("id");
//        System.out.println("Field of id = "+ someField.getType());

        Field[] fields = classEmployee.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        Method someMethod1 = classEmployee.getMethod("increaseSalary");
        System.out.println("Return type method increaseSalary = " + someMethod1.getReturnType()
                + ", parametr types = " + Arrays.toString(someMethod1.getParameterTypes()));

        Method someMethod2 = classEmployee.getMethod("setSalary", double.class);
        System.out.println("Return type method setSalary = " + someMethod2.getReturnType()
                + ", parametr types = " + Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("****************************************************");

        Method[] methods = classEmployee.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName()
                    + ", return type method  = " + method.getReturnType()
                    + ", parametr types = " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("****************************************************");

        Method[] allMethods = classEmployee.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method = " + method.getName()
                    + ", return type method  = " + method.getReturnType()
                    + ", parametr types = " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("****************************************************");

        Method[] allPublicMethods = classEmployee.getDeclaredMethods();
        for (Method method : allPublicMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of public method = " + method.getName()
                        + ", return type method  = " + method.getReturnType()
                        + ", parametr types = " + Arrays.toString(method.getParameterTypes()));
            }

        }

        System.out.println("****************************************************");

        Constructor constructor1 = classEmployee.getConstructor();

        System.out.println("Constructor has " + constructor1.getParameterCount()
                + " parameters, their types are: "
                + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("****************************************************");

        Constructor constructor2 = classEmployee.getConstructor(int.class,
                String.class, String.class);

        System.out.println("Constructor has " + constructor2.getParameterCount()
                + " parameters, their types are: "
                + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("****************************************************");

        Constructor[]  constructors = classEmployee.getDeclaredConstructors();

        for(Constructor constructor: constructors){
            System.out.println("Constructor "+ constructor.getName()
            + "has " + constructor.getParameterCount()
            + " pararmeters, their type are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
