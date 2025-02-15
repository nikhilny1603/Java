import java.util.Scanner;
public class ArraySwapping{
    public static void main(String []args){
        int []a = new int[6];
        int []b = new int[6];
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements of the First Array : ");
        for(int i = 0 ; i <6 ; i++ ){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Elements of the Second Array : ");
        for(int i = 0 ; i <6 ; i++ ){
            b[i] = sc.nextInt();
        }
        System.out.println("The Elements of the First Array are : ");
        for(int i = 0 ; i <6 ; i++ ){
            System.out.print(a[i]+" \n");
        }
        System.out.println("The Elements of the Second Array are : ");
        for(int i = 0 ; i <6 ; i++ ){
            System.out.print(b[i]+" \n");
        }
        System.out.println("Elements of Array After Swapping :n");
        for(int i = 0 ; i <6 ; i++){
        temp = a[i];
        a[i] = b[i];
        b[i] = temp;
        }
        System.out.println("The Elements of the First Array are : ");
        for(int i = 0 ; i <6 ; i++){
            System.out.print(a[i]+" \n");
        }z
        System.out.println("The Elements of the Second Array are : ");
        for(int i = 0 ; i <6 ; i++ ){
            System.out.print(b[i]+" \n");
        }
    }
}