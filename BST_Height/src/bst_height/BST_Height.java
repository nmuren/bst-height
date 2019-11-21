package bst_height;

import java.util.Scanner;

public class BST_Height {

    private static int getHeight(Node root) {
        int left = 0, right = 0;
        if (root.getLeftChild() != null) {
            left += getHeight(root.getLeftChild()) + 1;
        }
        if (root.getRightChild() != null) {
            right += getHeight(root.getRightChild()) + 1;
        }
        return Math.max(left, right);
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node currNode;
            if (data <= root.getData()) {
                currNode = insert(root.getLeftChild(), data);
                root.setLeftChild(currNode);
            } else {
                currNode = insert(root.getRightChild(), data);
                root.setRightChild(currNode);
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            int data = input.nextInt();
            root = insert(root, data);
        }

        System.out.println(getHeight(root));
    }

}
