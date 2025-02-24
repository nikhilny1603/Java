class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class StackLinkedList{
    private Node Top;
    public StackLinkedList(){
        this.Top = null;
    }
    public void push(int data){
    Node newnode = new Node(data);
    newnode.next = Top;
    Top = newnode;
    System.out.println(data + " successfully pushed into the Stack.");
}
public boolean isempty(){
    if(Top == null){
        return false;
    }
    return true;
}
public int pop(){
    if(isempty()){
        System.out.println("Stack is Empty.");
        return -1;
    }
    int poppedData = Top.data;
    Top = Top.next;
    return poppedData;
}
public void Display(){
    if(isempty()){
        System.out.println("Stack is Empty.");
    }
    System.out.println("Stack Elements : ");
    Node current = Top;
    while(Top != null){
        System.out.println(current.data + " ");
        current = current.next;
    }
}
}

class Stack{
    public static void main(String []args){
        StackLinkedList sl = new StackLinkedList();
        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.push(40);
        sl.push(50);
        sl.Display();
        sl.pop();
        sl.Display();
        sl.pop();
        sl.Display();
    }
}