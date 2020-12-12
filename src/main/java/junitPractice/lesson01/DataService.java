package junitPractice.lesson01;


import java.util.Comparator;
import java.util.List;

public class DataService {

    public static int findMax(List<Integer> numbers) throws Exception {
        if (numbers == null || numbers.size() == 0) {
            throw new Exception("List of numbers is empty");
        }
        int max = numbers.get(0);
        for (int current : numbers) {
            if (max < current) {
                max = current;
            }
        }
        return max;
    }

    public static int findMaxByStream(List<Integer> numbers) throws Exception {
        return numbers.stream().max(Comparator.naturalOrder()).orElseThrow(() -> new Exception("List of numbers is empty"));
    }

}