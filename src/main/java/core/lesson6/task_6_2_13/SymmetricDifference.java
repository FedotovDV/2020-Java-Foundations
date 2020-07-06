package core.lesson6.task_6_2_13;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static void main(String[] args) {

        Set s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        HashSet s2 = new HashSet<>();
        s2.add(0);
        s2.add(1);
        s2.add(2);

        Set result = symmetricDifference(s1, s2);
        System.out.println(result);

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet<T> resultSet1 = new HashSet<>();
        HashSet<T> resultSet2 = new HashSet<>();
        resultSet1.addAll(set1);
        resultSet1.removeAll(set2);

        resultSet2.addAll(set2);
        resultSet2.removeAll(set1);

        resultSet1.addAll(resultSet2);
        return resultSet1;
    }
}
