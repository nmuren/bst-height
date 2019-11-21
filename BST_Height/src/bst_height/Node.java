package bst_height;

public class Node {

    private final int data;
    private Node leftChild;
    private Node rightChild;

    Node(int data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getData() {
        return data;
    }

}
