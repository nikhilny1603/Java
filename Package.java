import java.util.Scanner;
class Package{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("\n1.Arithmetic Operations");
        System.out.println("2.Statistical Operation");
        System.out.println("3.Trigonometric Operation");
        System.out.println("4.Exit..");
        System.out.print("Enter Your Choice From Above: ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
            System.out.println("Enter Two Numbers : ");
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();

            System.out.println("Arithmetic Operations :- ");
            System.out.println("Addition : "+ (a+b));
            System.out.println("Sustraction : "+ (a-b));
            System.out.println("Multiplication : "+ (a*b));
            System.out.println("Quotient : "+ (a/b));
            System.out.println("Remainder : "+ (a%b));
                break;
            case 2:
            int add = 0;
            double av = 0;
            System.out.println("Enter the Numbers : ");
            int[] arr=new int[6];
            for(int i=0;i<6;i++){
                arr[i]=sc.nextInt();
            }
            for(int i:arr){
                add = add + i;
            }
            av = add/6;
            System.out.println("Statistical Operations :- ");
            System.out.println("Average of the Array : "+ av);
            break;
            case 3: 
                System.out.println("Enter the Angle in Degree : ");
                double an;
                an=sc.nextInt();
                double rad = Math.toRadians(an);
                System.out.println("Trigonometric Operations :- ");
                System.out.println("Sine Value : "+ Math.sin(rad));
                System.out.println("Cosine Value : "+ Math.cos(rad));
                System.out.println("Tangent Value : " + Math.tan(rad));
            break;
            case 4:
                System.out.println("\nYou Exitted From Switch Statements...\n");
                System.exit(0);
            break;
            default:
                System.out.println("\nYou Have Entered Wrong Choice. Please Enter from Above Choices.");
                break;
        }
    }
}
}