import java.util.Scanner;

public class Maximum {
    static Scanner sc = new Scanner(System.in);
    public int MaxNumber(){
    System.out.println("Enter the First Number : ");
    int a = sc.nextInt();
    System.out.println("Enter the Second Number : ");
    int b = sc.nextInt();
    int maxno = Math.max(a, b);
    return maxno;
    }
    public static void main(String[] args) {
        Maximum m = new Maximum();
        System.out.println("Maximum Number among the Number is "+m.MaxNumber());
    }
}
