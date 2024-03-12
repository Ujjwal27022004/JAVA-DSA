package Trees;

public class BST {
    public class Node {
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.val = value;
        }

        public int getValue() {
            return val;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.val) {
            node.left = insert(node.left, value);
        }
        if (value > node.val) {
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right)) - 1;
        return node;
    }

    public void display() {
        display(this.root, "Root node : ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left, "Left of " + node.val + " : ");
        display(node.right, "Right of " + node.val + " : ");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = { 8, 6, 4, 9, 2 };
        tree.populate(nums);
        tree.display();
    }

}
