package interfaces;

import java.util.Arrays;

public class Farm {
    public static void main(String[] args) throws CloneNotSupportedException {

        Cat cat1 = new Cat();
        cat1.setName("Matilda");
        cat1.setBreed("Persian");
        cat1.setWeight(15);
        cat1.talk();
        cat1.print();
        Cat cat2 = cat1.clone();
        Cat cat3 = new Cat("Mars", "SomeBreed");
        cat3.setWeight(11);
        System.out.println("cat1 = " + cat1);
        System.out.println("cat2 = " + cat2);
        System.out.println("(cat1 == cat2) = " + (cat1 == cat2));
        System.out.println("cat1.compareTo(cat2) = " + cat1.compareTo(cat2));
        cat2.setWeight(11);
        Cat[] catsArray = new Cat[]{cat1, cat2, cat3};
        Arrays.sort(catsArray);
        System.out.println("Arrays.toString(catsArray) = " + Arrays.toString(catsArray));

        Cow cow1 = new Cow();
        cow1.talk();
        cow1.print();

        SuperCow superCow1 = new SuperCow();
        superCow1.setName("Matrena");
        SuperCow superCow2 = superCow1.clone();
        superCow2.setPower(200);
        System.out.println("superCow1.toString() = " + superCow1.toString());
        System.out.println("superCow2.toString() = " + superCow2.toString());

        SuperCow superCow3 = new SuperCow();
        superCow3.setName("Avrora");
        superCow3.setPower(50);
        System.out.println("superCow3.toString() = " + superCow3.toString());
        SuperCow superCow4 = new Cow();
        superCow4.setName("Cow");
        superCow4.setPower(150);
        System.out.println("superCow4.toString() = " + superCow4.toString());
        System.out.println("cow1.toString() = " + cow1.toString());
        SuperCow[] superCowsArray = new SuperCow[]{cow1, superCow1, superCow2, superCow3, superCow4};
        Arrays.sort(superCowsArray);
        System.out.println("Arrays.toString(superCowsArray) = " + Arrays.toString(superCowsArray));


    }
}
