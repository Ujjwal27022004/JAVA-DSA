package Trees;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class binarytree2 {
    
    class Node {
        int val;
        Node left;
        Node right;

        Node(int value){
            this.val = value;
        }
    }

    Node root;
    Scanner sc = new Scanner(System.in);
    
    public void populate() {
        System.out.println("Enter the value of node");
        int val = sc.nextInt();
        root = new Node(val);
        populate(root);
    }

    private void populate(Node node) {
        System.out.println("Do you want to enter node at left of " + node.val + "? (true/false)");
        boolean a = sc.nextBoolean();
        if(a) {
            System.out.println("Enter the value");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(node.left);
        }
        
        System.out.println("Do you want to enter node at right of " + node.val + "? (true/false)");
        boolean b = sc.nextBoolean();
        if(b) {
            System.out.println("Enter the value");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(node.right);
        }
    }

    public void display() {
        display(root);
    }
    
    private void display(Node node) {
        if(node == null) {
            return;
        }
        System.out.println(node.val);
        display(node.left);
        display(node.right);
    }

    public void BFS(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.val+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        binarytree2 tree = new binarytree2();
        tree.populate();
        tree.display();
        tree.BFS();
    }
}
