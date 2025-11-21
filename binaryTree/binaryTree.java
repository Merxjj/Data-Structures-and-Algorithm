package binaryTree;

// BinaryTree.java
public class BinaryTree {

    // Node class representing each node of the tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root; // root of the binary tree

    // Index for building tree from array
    private int idx;

    public BinaryTree() {
        root = null;
        idx = -1;
    }

    // Build tree from a pre-order array representation (-1 for null)
    public Node buildTree(int[] nodes) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public void setRoot(Node node) {
        this.root = node;
    }

    // Pre-order traversal: root -> left -> right
    public void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // In-order traversal: left -> root -> right
    public void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Post-order traversal: left -> right -> root
    public void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Search for a value in the tree
    public boolean search(Node node, int key) {
        if (node == null) return false;
        if (node.data == key) return true;
        return search(node.left, key) || search(node.right, key);
    }

    // Height of the tree
    public int height(Node node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Print tree in level-order (Breadth-first traversal)
    public void levelOrder(Node node) {
        if (node == null) return;
        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
    }

    // Getter for root
    public Node getRoot() {
        return root;
    }

    // Main method to test
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = tree.buildTree(nodes);
        tree.setRoot(root);

        System.out.println("Pre-order traversal:");
        tree.preorder(root);
        System.out.println();

        System.out.println("In-order traversal:");
        tree.inorder(root);
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postorder(root);
        System.out.println();

        System.out.println("Level-order traversal:");
        tree.levelOrder(root);
        System.out.println();

        int key = 5;
        System.out.println("Search for " + key + ": " + tree.search(root, key));

        System.out.println("Height of tree: " + tree.height(root));
    }
}
