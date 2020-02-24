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
        Object[] result = new Object[size];
        Node<T> node = start;
        int i = 0;
        while (node != null) {
            result[i++] = node.getValue();
            node = node.getNext();
        }
        return result;
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
        Node<T> currNode = start;
        for (int i = 0; i < size; i++) {
            if (currNode.getValue().equals(t)) {
                remove(i);
                return true;
            }
            currNode = currNode.getNext();
        }
        return false;
    }

    public void clear() {
        start = end = null;
        size = 0;
    }

    public Node<T> get(int index) {
        Node<T> node = start;
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Wrong index: " + index);
        }
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }


    public Node<T> set(int index, T t) {
        Node<T> node = start;
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Wrong index: " + index);
        }
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setValue(t);
        return node;
    }


    public void add(int index, T t) {
        Node<T> currNode = start;
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("Wrong index: " + index);
        }
        for (int i = 0; i < index; i++) {
            currNode = currNode.getNext();
        }
        Node<T> prevNode = currNode.getPrevious();
        Node<T> addNode = new Node<>(t, currNode, prevNode);
        currNode.setPrevious(addNode);
        if (prevNode == null) {
            start = addNode;
        } else {
            prevNode.setNext(addNode);
        }
        size++;
    }


    public Node<T> remove(int index) {
        Node<T> currNode = get(index);
        Node<T> nextNode = currNode.getNext();
        Node<T> prevNode = currNode.getPrevious();
        if (nextNode != null) {
            nextNode.setPrevious(prevNode);
            if (prevNode == null) {
                start = nextNode;
            }
        }
        if (prevNode != null) {
            prevNode.setNext(nextNode);
            if (nextNode == null) {
                end = prevNode;
            }
        }
        size--;
        if (size == 0) {
            start = end = null;
        }
        return currNode;
    }

    public int indexOf(T t) {
        Node<T> node = start;
        for (int i = 0; i < size; i++) {
            if (node.getValue().equals(t)) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    public int lastIndexOf(T t) {
        Node<T> node = end;
        for (int i = size - 1; i > 0; i--) {
            if (node.getValue().equals(t)) {
                return i;
            }
            node = node.getPrevious();
        }
        return -1;
    }


}
