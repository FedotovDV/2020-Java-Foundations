package collections.listPractice;


import java.util.*;
import java.util.function.UnaryOperator;

public class MyArrayList<T> {

    private T[] array;
    private int size;

    public MyArrayList() {
        this(0);
    }

    public MyArrayList(int size) {
        array = (T[]) new Object[10];
        this.size = size;
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean contains(T o) {
        for (T t : array) {
            if (t.equals(o)) {
                return true;
            }
        }
        return false;
    }


    public Iterator iterator() {
        return null;
    }

    public T[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public T[] toArray(T[] o) {
        return Arrays.copyOf(array, size);
    }


    public boolean add(T t) {
        if (array.length == size) {
            T[] tempArray = (T[]) new Object[(3 * array.length / 2 + 1)];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }
        array[size] = t;
        size++;
        return true;
    }


    public boolean remove(T t) {
        T[] tempArray = (T[]) new Object[array.length];
        int index = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(t) && count < 1) {
                count++;
            } else {
                tempArray[index] = array[i];
                index++;
            }
        }
        array = tempArray;
        size--;
        return true;
    }


    public boolean containsAll(Collection c) {
        return false;
    }


    public boolean addAll(Collection c) {
        return false;
    }


    public boolean addAll(int index, Collection c) {
        return false;
    }


    public boolean removeAll(Collection c) {
        return false;
    }


    public boolean retainAll(Collection c) {
        return false;
    }


    public void clear() {

    }


    public Object get(int index) {
        return null;
    }


    public Object set(int index, Object element) {
        return null;
    }


    public void add(int index, Object element) {

    }


    public Object remove(int index) {
        return null;
    }


    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public ListIterator listIterator() {
        return null;
    }


    public ListIterator listIterator(int index) {
        return null;
    }


    public List subList(int fromIndex, int toIndex) {
        return null;
    }


    public void replaceAll(UnaryOperator operator) {

    }


    public void sort(Comparator c) {

    }


    public Spliterator spliterator() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList{\n");
        for (int i = 0; i < size; i++) {
            result.append("[").append(array[i].toString()).append("]\n");
        }
        result.append("}");
        return result.toString();
    }
}

