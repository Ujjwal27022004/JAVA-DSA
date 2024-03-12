package Trees;

import java.util.*;

public class BinaryTree {
    private class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    private Node root;
    Scanner sc = new Scanner(System.in);


    // Only for root node and further nodes in the public recursion function populate(Node node)
    public void populate() {
        System.out.print("Enter the value of root node");
        int value = sc.nextInt();
        root = new Node(value);
        populate(root);
    }
    // for further nodes 

    private void populate(Node node) {
        System.out.println("Do you want to enter at the left of " + node.val);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left of " + node.val);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(node.left);
        }


        System.out.println("Do you want to enter at the right of " + node.val);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of " + node.val);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(node.right);
        }

    }

    public void display(){
        display(root," ");
    }

    private void display(Node node,String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left,indent + "\t");
        display(node.right,indent + "\t");
    }

    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val);
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.println(node.val);
        inorder(node.right);
    }
    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.val);
    }


    public void BSF(){
        BSF(root);
    }
    public void BSF(Node node){
        if(node.left == null && node)
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate();
        tree.display();
    }
}
