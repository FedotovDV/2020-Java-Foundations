package core;

import oop.SomeClass;

import java.lang.reflect.Field;

public class TestPrivateAccess2 {


        public static void main(String[] args) {
            SomeClass someClass = new SomeClass();

            try {
                Field reflectField = SomeClass.class.getDeclaredField("name");
                Field reflectField2 = SomeClass.class.getDeclaredField("x");

                reflectField.setAccessible(true);
                reflectField2.setAccessible(true);

                String fieldValue = (String) reflectField.get(someClass);
                Integer fieldValue2 = (Integer) reflectField2.get(someClass);

                System.out.println(reflectField);
                System.out.println(fieldValue);

                System.out.println(reflectField2);
                System.out.println(fieldValue2);
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

        }
    }

