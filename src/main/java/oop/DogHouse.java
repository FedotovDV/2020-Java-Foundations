package oop;

public class DogHouse {
    public static void main(String[] args) {
        Dog grand = new Dog("Grand");
        System.out.println(grand.getName());
        grand.setName("Viktor");
        System.out.println(grand.getName());


    }
}
