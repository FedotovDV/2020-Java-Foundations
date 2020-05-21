package treePractice.binaryTree;

public class BinaryTreeRun {

    public static void main(String[] args) {
        BinaryTree<String>  theTree = new BinaryTree<>();
        theTree.insert(50,"one");
        theTree.insert(25,"two");
        theTree.insert(75,"three");
        theTree.insert(12,"four");
        theTree.insert(37,"five");
        theTree.insert(43,"six");
        theTree.insert(30,"seven");
        System.out.println("theTree.find(12) = " + theTree.find(12));
    }
}
