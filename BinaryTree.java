import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.left = null;
        this.right = null;    
    }
}

class BinaryTreeCreation{
    Node root;
    public void Insert(int data){
        root = addRecursive(root, data);
    }
    public Node addRecursive(Node curr, int data){
        if(curr == null){
            return new Node(data);
        }
        if(data < curr.data){
            curr.left = addRecursive(curr.left, data);
        }
        else if(data > curr.data){
            curr.right = addRecursive(curr.right, data);
        }
        return curr;
    }
    public void Inorder(){
        InorderTraversal(root);
    }
    private void InorderTraversal(Node node){
        if(root != null){
            InorderTraversal(node.left);
            System.out.println(node.data + " ");
            InorderTraversal(node.right);
        }
    }
}   
class BinaryTree{
    public static void main(String []args){
        BinaryTreeCreation b = new BinaryTreeCreation();
        b.Insert(10);
        b.Insert(7);
        b.Insert(20);
        b.Insert(5);
        b.Insert(23);
        b.Insert(9);
        b.Inorder();
    }
}