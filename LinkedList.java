class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    private Node head;
    LinkedList(){
    head = null;
    }
    public void create(int value){
        Node newnode = new Node(value);
        if(head == null){
            head.next = newnode;
        }

    }
}