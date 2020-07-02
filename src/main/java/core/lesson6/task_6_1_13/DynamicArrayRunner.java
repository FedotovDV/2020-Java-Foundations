package core.lesson6.task_6_1_13;

import java.util.Arrays;

public class DynamicArrayRunner {

    public static void main(String[] args) {

        DynamicArray<Object> array = new DynamicArray<>();
        int count = 0;
        while (count < 20) {
            System.out.println(array.length() + " length");
            array.add("One");
            System.out.println(array.get(count));
            System.out.println(array.size());
            count++;
        }

    }

    public static class DynamicArray<T> {

        private T[] array;
        private int size;

        public DynamicArray() {
            this(0);
        }

        public DynamicArray(int size) {
            array = (T[]) new Object[10];
            this.size = size;
        }

        public void add(T el) {
            if (array.length == size) {
                resizeArray();
            }
            array[size++] = el;
        }

        private void resizeArray() {
            T[] tempArray = (T[]) new Object[(3 * array.length / 2 + 1)];
            array =  Arrays.copyOf(array,tempArray.length);
        }

        public void remove(int index) {
            T oldValue = array[index];
            if (size - index >= 0) System.arraycopy(array, index + 1, array, index, size - index);
            array[--size] = null;
        }

        public T get(int index) {
            if (index >= size) {
                throw new IndexOutOfBoundsException("Wrong index: " + index);
            }
            return array[index];
        }

        public int size() {
            return size;
        }

        public int length() {
            return array.length;
        }
    }
}
