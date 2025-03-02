import java.util.Stack;

class StackOperations{
    public static void main(String []args){
    Stack<Integer> s = new Stack<>();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    System.out.println("Peek Element of the Stack : "+s.peek());
    System.out.println("Popped Element of the Stack : "+s.pop());
    System.out.println("Peek Element of the Stack : "+s);
    System.out.println("Peek Element of the Stack : "+s.empty());
    System.out.println("Position of Element in the Stack : "+s.search(20));

}
}