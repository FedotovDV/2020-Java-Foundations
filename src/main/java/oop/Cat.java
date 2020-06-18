package oop;

public class Cat {
    public static boolean isLoveMilk = true;//константа на уровне класса, если происходит изменение.

    public void setIsLoveMilk() {
      isLoveMilk = false;
    }

    public  boolean isIsLoveMilk() {
        return isLoveMilk;
    }
}
