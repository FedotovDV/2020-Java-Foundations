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
            resizeArray();
        }
        array[size++] = t;
        return true;
    }

    private void resizeArray() {
        T[] tempArray = (T[]) new Object[(3 * array.length / 2 + 1)];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }


    public boolean remove(T t) {
        T[] tempArray = (T[]) new Object[array.length];
        int index = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(t) && count < 1) {
                count++;
            } else {
                tempArray[index++] = array[i];
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
        array = (T[]) new Object[10];
        size = 0;
    }


    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Wrong index: " + index);
        }
        return array[index];
    }


    public T set(int index, T element) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Wrong index: " + index);
        }
        T oldValue = array[index];
        array[index] = element;
        return oldValue;
    }


    public void add(int index, T element) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Wrong index: " + index);
        }else  if (array.length == size) {
            resizeArray();
        }
        for (int i = size-1; i > index; i--) {
            array[i+1] = array[i];
        }
        array[index]=element;
        size++;


    }


    public T remove(int index) {
        T oldValue = array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        return oldValue;

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
            result.append("[").append(i).append(array[i].toString()).append("]\n");
        }
        result.append("}");
        return result.toString();
    }
}

