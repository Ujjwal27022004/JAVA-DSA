package Trees;

import java.util.Scanner;

public class BST2 {
    public class Node {
        int value;
        Node left;
        Node right;

        Node(int val) {
            this.value = val;
        }
    }

    Node root;
    Scanner sc = new Scanner(System.in);

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        return node;
    }

    public void display() {
        display(this.root, "Root node : ");
    }

    private void display(Node node, String detail) {
        if (node == null) {
            return;
        }
        System.out.println(detail + node.value);
        display(node.left, "left of " + node.value + " : ");
        display(node.right, "right of " + node.value + " : ");
    }

    public static void main(String[] args) {
        BST2 bst = new BST2();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(13);
        bst.insert(17);
        bst.display();
    }
}
