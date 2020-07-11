package core.lesson7.task_7_2_11;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class MinMaxConsumerRunner {

    public static void main(String[] args) {

        MinMaxConsumer<Integer> minMaxConsumer = new MinMaxConsumer<>();
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1).limit(10);
//        Stream<Integer> stream = Stream.empty();
        Comparator<Integer> order = Comparator.naturalOrder();
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
            System.out.println("min = " + a + ", max = " + b);
        };
        minMaxConsumer.findMinMax(stream, order, biConsumer);

    }

//    public <T> void findMinMax(
//            Stream<? extends T> stream,
//            Comparator<? super T> order,
//            BiConsumer<? super T, ? super T> minMaxConsumer) {
//
//        T max = stream
//                .max(order)
//                .get();
//
//        T min = stream
//                .min(order)
//                .get();
//
//        if ((min != null && max != null)) {
//            minMaxConsumer.accept(min, max);
//        } else {
//            minMaxConsumer.accept(null, null);
//        }
//    }
}
