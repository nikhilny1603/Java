import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


class BinaryTreeArray {
    static int i = 0; 

    public static Node BuildTree(int[] nodes) {
        if (i >= nodes.length) {
            return null; 
        }
        if (nodes[i] == -1) {
            i++; 
            return null; 
        }
        Node newNode = new Node(nodes[i]);
        i++; 
        newNode.left = BuildTree(nodes);
        newNode.right = BuildTree(nodes);

        return newNode;
    }
    public static void Preorder(Node root){
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Inorder(Node root){
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public static void Postorder(Node root){
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");

    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
        BinaryTreeArray bt = new BinaryTreeArray();
        Node root = bt.BuildTree(nodes);
        if (root != null) {
            System.out.println("Root Node: " + root.data); 
            System.out.println("The tree is empty.");
        }
        bt.Preorder(root);
        bt.Inorder(root);
        bt.Postorder(root);
    }
}