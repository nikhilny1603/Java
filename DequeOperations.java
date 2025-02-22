import java.util.ArrayDeque;
import java.util.Deque;

class DequeOperations{
    public static void main(String []args){
        Deque<Integer> d = new ArrayDeque<>();
        d.addFirst(10);
        d.addLast(20);
        d.addLast(30);
        System.out.println("Deque Elements : "+ d);
        System.out.println("First Element : "+ d.peekFirst());
        System.out.println("Last Element : "+ d.peekLast());

    }
}