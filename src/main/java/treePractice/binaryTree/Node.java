package treePractice.binaryTree;

import lombok.*;
/*
from
Роберт Лафорте Структуры данных и адгоритмы
Двоичные деревья
*/
@Getter
@Setter
public class Node {

    private int key;
    private double overData;
    private Node leftChaild;
    private Node rightChild;

    public void displayNode() {
        System.out.print('{');
        System.out.print(key);
        System.out.print(". ");
        System.out.print(overData);
        System.out.print("} ");
    }
}
