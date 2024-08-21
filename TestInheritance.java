import java.util.Scanner;
class Person{
String Name;
int Age;
double Mobile;
String City;
Scanner sc=new Scanner(System.in);

void input(){
System.out.println("\nEnter the Details : ");
System.out.print("Enter the Name : ");
Name=sc.next();
System.out.print("Enter the Age : ");
Age=sc.nextInt();
System.out.print("Enter the Mobile No. : ");
Mobile=sc.nextDouble();
System.out.print("Enter the City : ");
City=sc.next();
}
}
class Student extends Person{
int Prn;
String ClgName;
float Cgpa;

void get(){
System.out.print("Enter the Prn : ");
Prn=sc.nextInt();
System.out.print("Enter the Clg Name : ");
ClgName=sc.next();
System.out.print("Enter the Cgpa : ");
Cgpa=sc.nextFloat();
}
void show(){
System.out.println("\n*** Details *** ");
System.out.println("Name : "+Name);
System.out.println("Age : "+Age);
System.out.println("Mobile No. : "+Mobile);
System.out.println("City : "+City);
System.out.println("Prn No. : "+Prn);
System.out.println("College Name : "+ClgName);
System.out.println("Cgpa : "+Cgpa);
}
}
class TestInheritance{
public static void main(String []args){
Student s=new Student();
s.input();
s.get();
s.show();
}
}