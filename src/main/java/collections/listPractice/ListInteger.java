package collections.listPractice;

import java.util.ArrayList;
import java.util.List;

public class ListInteger {

    public static void main(String[] args) {
        List<Integer> someListInt = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            someListInt.add(i);
        }

        for (Integer element : someListInt) {
            if ((element % 3) == 0) {
                System.out.println(element);
            }
        }
        int number = 3;
        System.out.println("Is number " + number + " in someList? " + someListInt.contains(number));
        someListInt.remove((Integer) 3);
        System.out.println("Is number " + number + " in someList? " + someListInt.contains(number));

    }
}
