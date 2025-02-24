import java.util.LinkedList;
import java.util.Queue;

class QueueOperations{
    public static void main(String []args){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("Elements of the Queue are : "+ q);
        System.out.println("Peek Element : "+ q.peek());
        System.out.println("Popped Element : "+ q.poll());
    }
}