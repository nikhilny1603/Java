import java.util.Scanner;
class Arithmetic{
public static void main(String[] args){
System.out.println("Integer Value Arithmetic Operations : \n");
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("\nEnter First Number : ");
a=sc.nextInt();
System.out.println("Enter Second Number");
b=sc.nextInt();
System.out.println("\nAddition of Two Number is "+ (a+b) +"\n");
System.out.println("Subtraction of Two Number is "+ (a-b) +"\n");
System.out.println("Multiplication of Two Number is "+ (a*b) +"\n");
System.out.println("Division of Two Number is "+ (a/b) +"\n");
System.out.println("Remainder of Two Number is "+ (a%b) +"\n");

System.out.println("Floating Value Arithmetic Operations : \n");
float c=(float)a;
float d=(float)b;
System.out.println("\nAddition of Two Number is "+ (c+d) +"\n");
System.out.println("Subtraction of Two Number is "+ (c-d) +"\n");
System.out.println("Multiplication of Two Number is "+ (c*d) +"\n");
System.out.println("Division of Two Number is "+ (c/d) +"\n");
System.out.println("Remainder of Two Number is "+ (c%d) +"\n");

}
}