package collections.listPractice;


import java.util.*;

public class MyLinkedList<T> {

    private Node<T> start;
    private Node<T> end;
    private int size;

    public MyLinkedList(Node<T> start, Node<T> end) {
        this.start = start;
        this.end = end;
    }

    public MyLinkedList() {
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList{\n");
        Node<T> node = start;
        while (node != null) {
            result.append("[").append(node.getValue().toString()).append("]\n");
            node = node.getNext();
        }
        result.append("}");
        return result.toString();
    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return start == null;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }


    public boolean add(T t) {
        Node<T> node = new Node<>(t, null, null);
        if (isEmpty()) {
            start = end = node;
        } else {
            end.setNext(node);
            node.setPrevious(end);
            end = node;
        }
        size++;
        return true;
    }


    public boolean remove(T t) {
        Node<T> curNode = start;
        Node<T> prevNode = null;
        while (curNode != null) {
            if (curNode.getValue().equals(t)) {
                if (curNode.getNext() != null && prevNode != null) {
                    prevNode.setNext(curNode.getNext());
                    curNode.setPrevious(prevNode);
                    return true;
                } else if (prevNode == null) {
                    curNode = curNode.getNext();
                    curNode.setPrevious(null);
                    start = curNode;
                    return true;
                } else {
                    curNode = prevNode;
                    curNode.setNext(null);
                    end = curNode;
                    return true;
                }
            }
            prevNode = curNode;
            curNode = curNode.getNext();
        }
        return false;
    }


    public boolean containsAll(Collection c) {
        return false;
    }


    public boolean addAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
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

    public List subList(int fromIndex, int toIndex) {
        return null;
    }


}
