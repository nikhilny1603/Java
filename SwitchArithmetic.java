import java.lang.Math;
import java.util.Scanner;
public class SwitchArithmetic {
    public static void main(String[] args){
        int sw ;
        int first ;
        int second ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select one from the Following : \n");
        System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division \n5) Sqaure Root \n6) Power\n7) Sqaure\n");
        System.out.print("Enter Your Choice : ");
        System.out.println();
        sw = sc.nextInt();
        switch(sw){
            case 1:
                System.out.println("Enter the Value of First Number : ");
        first = sc.nextInt();
        System.out.println("Enter the Value of Second Number : ");
        second = sc.nextInt();
        System.out.println("Addition of the Two Numbers is : "+ (first + second));
            break;
            case 2:
                System.out.println("Enter the Value of First Number : ");
        first = sc.nextInt();
        System.out.println("Enter the Value of Second Number : ");
        second = sc.nextInt();
        System.out.println("Subtraction of the Two Numbers is : "+ (first - second));
            break;
            case 3:
                System.out.println("Enter the Value of First Number : ");
        first = sc.nextInt();
        System.out.println("Enter the Value of Second Number : ");
        second = sc.nextInt();
        System.out.println("Multiplication of the Two Numbers is : "+ (first * second));
            break;
            case 4:
                System.out.println("Enter the Value of First Number : ");
        first = sc.nextInt();
        System.out.println("Enter the Value of Second Number : ");
        second = sc.nextInt();
        System.out.println("Division of the Two Numbers is : "+ (first / second));
            break;
            case 5:
                System.out.println("Enter the Value of Number : ");
        first = sc.nextInt();
        System.out.println("Square Root of the Numbers is : "+ (Math.sqrt(first)));
            break;
            case 6:
                System.out.println("Enter the Base Value : ");
        first = sc.nextInt();
        System.out.println("Enter the Exponential Value : ");
        second = sc.nextInt();
        System.out.println("Power of the Numbers is : "+ (Math.pow(first, second)));
            break;
            case 7:
                System.out.println("Enter the Value of Number : ");
        first = sc.nextInt();
        System.out.println("Square of the Numbers is : "+ (first * first));
            break;
            
        }
    }
}