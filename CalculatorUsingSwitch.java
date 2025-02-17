
import java.util.Scanner;

class CalculatorUsingSwitch{
    public static int Addition(int a,int b){
        return a + b;
    }
    public static int Subtraction(int a,int b){
        if(a > b){
            return a - b;
        }
        else if(a < b){
            return b - a;
        }
        else {
            return 0;
        }
    }
    public static int Multiplication(int a,int b){
        return a * b;
    }
    public static int Division(int a,int b){
        if(a > b){
            return a / b;
        }
        else if(a < b){
            return b / a;
        }
        else {
            return 0;
        }
    }
    public static Double Sqrt(Double a){
        return Math.sqrt(a);
    }
    public static Double Square(Double a){
        return a * a;
    }
    public static Double Cube(Double a){
        return a * a * a;
    }
    public static int Power(int a,int b){
        return a ^ b;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        Double c;
        System.out.println("\n*****  Operations  *****\n");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Square Root\n6.Square\n7.Cube\n8.Power\n9.Exit");
        System.out.println("*** Choose an Operation from Above ***");
        int ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("Enter the First Number : ");
                a = sc.nextInt();
                 System.out.println("Enter the Second Number : ");
                b = sc.nextInt();
                System.out.println("Addition of the Two Numbers  : "+ Addition(a,b));
            break;
            case 2:
                System.out.println("Enter the First Number : ");
                a = sc.nextInt();
                 System.out.println("Enter the Second Number : ");
                b = sc.nextInt();
                System.out.println("Subtraction of the Two Numbers  : "+ Subtraction(a,b));
            break;
            case 3:
                System.out.println("Enter the First Number : ");
                a = sc.nextInt();
                 System.out.println("Enter the Second Number : ");
                b = sc.nextInt();
               System.out.println("Multiplication of the Two Numbers  : "+ Multiplication(a,b));
            break;
            case 4:
                System.out.println("Enter the First Number : ");
                a = sc.nextInt();
                 System.out.println("Enter the Second Number : ");
                b = sc.nextInt();
               System.out.println("Division of the Two Numbers  : "+ Division(a,b));
            break;
            case 5:
                System.out.println("Enter the Number for SquareRoot : ");
                c = sc.nextDouble();
               System.out.println("Square Root of the Number  : "+ Sqrt(c));
            break;
            case 6:
                System.out.println("Enter the Number for Square : ");
                c = sc.nextDouble();
               System.out.println("Square of the Number  : "+ Square(c));
            break;
            case 7:
                System.out.println("Enter the Number for SquareRoot : ");
                c = sc.nextDouble();
               System.out.println("Cube of the Number  : "+ Cube(c));
            break;
            case 8:
                 System.out.println("Enter the First Number : ");
                a = sc.nextInt();
                 System.out.println("Enter the Second Number : ");
                b = sc.nextInt();
               System.out.println("Power of the Two Numbers  : "+ Power(a,b));
            break;
            case 9:
                System.out.println("You Exitted...");
                return;
            default:
                System.out.println("Please, Enter from above Choices...");
            break;
        }
    }
}