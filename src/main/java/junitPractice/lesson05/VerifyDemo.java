package junitPractice.lesson05;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VerifyDemo {

    public static void main(String[] args) throws
            ClassNotFoundException,
            InvocationTargetException,
            IllegalAccessException {

        Class clazz = Class.forName("junitPractice.lesson05.Pupil");
        Pupil pupil = new Pupil();

        for (Method method : clazz.getMethods()) {
            Verify verify = method.getAnnotation(Verify.class);
            if (verify != null) {
                Object result = method.invoke(pupil);
                if ((Boolean) result == true) {
                    System.out.println(method.getName() + " passed");
                } else {
                    System.out.println(method.getName() + " failed");
                }
            }

        }

    }
}
