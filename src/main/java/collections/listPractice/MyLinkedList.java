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
                    size--;
                    return true;
                } else if (prevNode == null) {
                    curNode = curNode.getNext();
                    curNode.setPrevious(null);
                    start = curNode;
                    size--;
                    return true;
                } else {
                    curNode = prevNode;
                    curNode.setNext(null);
                    end = curNode;
                    size--;
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
        start = end = null;
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


    public Object set(int index, Object element) {
        return null;
    }


    public void add(int index, Object element) {

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
