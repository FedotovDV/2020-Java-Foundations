package core.lesson6.task_6_1_12;

import java.util.Objects;

public class PairRunner {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        System.out.println("i = " + i);
        String s = pair.getSecond(); // "hello"
        System.out.println("s = " + s);
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        System.out.println("mustBeTrue = " + mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println("mustAlsoBeTrue = " + mustAlsoBeTrue);

    }


    public static class Pair<T, E> {

        private final T valueT;
        private final E valueE;

        private Pair(T value, E value1) {
            this.valueT = value;
            this.valueE = value1;
        }

        public static <T, E> Pair<T, E> of(T valueT, E valueE) {
            return new Pair<>(valueT, valueE);
        }


        public T getFirst() {
            return valueT;
        }


        public E getSecond() {
            return valueE;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(valueT, pair.valueT) &&
                    Objects.equals(valueE, pair.valueE);
        }

        @Override
        public int hashCode() {
            return Objects.hash(valueT, valueE);
        }
    }
}
