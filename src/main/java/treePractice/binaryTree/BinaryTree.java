package treePractice.binaryTree;

import java.util.LinkedList;

/*
from
Роберт Лафорте Структуры данных и адгоритмы
Двоичные деревья
*/
public class BinaryTree<T> {


    private Node<T> root;

    public BinaryTree() {
        root = null;
    }

    // Поиск узла с заданным ключом
    public Node<T> find(int key) {
        // начать с корневого узла и
        Node<T> current = root;
        // пока не найдено совпадение
        while (current.key != key) {
            if (key < current.key) {
                // дваигаться налево
                current = current.leftChaild;
            } else {
                // дваигаться направо
                current = current.rightChild;
            }
            if (current == null) {
                // если потомка нет, поиск завершился неудачей
                return null;
            }
        }
        return current;
    }
// вставка нового узла
    public void insert(int key, T value) {
        Node<T> newNode = new Node<>();
        newNode.key = key;
        newNode.value = value;
        // усли корневой узел не существует
        if (root == null) {
            // новый узел в корень
            root = newNode;
        } else {
            // начинаем поиск с корневого узла
            Node<T> current = root;
            Node<T> parent;
            while(true){
                parent = current;
                if(key<current.key){
                    // двигаться налево
                    current = current.leftChaild;
                    if(current == null){
                        // если достигнут конец цепочки вставить слева
                        parent.leftChaild = newNode;
                        return;
                    }
                } else {
                    // двигаться направо
                    current = current.rightChild;
                    if(current == null){
                        // если достигнут конец цепочки вставить справа
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    /*
from
Роберт Лафорте Структуры данных и адгоритмы
Двоичные деревья
*/


    private static class Node<T> {

        int key;
        T value;
        Node<T> leftChaild;
        Node<T> rightChild;



    }
}
