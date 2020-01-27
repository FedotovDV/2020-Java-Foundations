package objectPractice;

import java.util.HashMap;

public class Train {
    public static void main(String[] args) {
        Man man1 = new Man("Bob", 32.0, 180.0, 180.0, "+150");
        Man man2 = new Man("Bob", 32.0, 180.0, 180.0, "+150");
        System.out.println("man1 == man2 :"+ (man1 == man2));
        Man man3 = man1;
        System.out.println("man1 == man3 :"+ (man1 == man3));
        System.out.println("man1.equals(man2) :"+ (man1.equals(man2)));
        System.out.println("man1.hashCode() = " + man1.hashCode());
        System.out.println("man2.hashCode() = " + man2.hashCode());
        System.out.println("man3.hashCode() = " + man3.hashCode());





    }
}
