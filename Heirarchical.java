import java.util.Scanner;
class Person{
String Name;
int Age;
double Mobile;
String City;
Scanner sc=new Scanner(System.in);

void input1(){
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
void output1(){
System.out.println("\n*** Details *** ");
System.out.println("Name : "+Name);
System.out.println("Age : "+Age);
System.out.println("Mobile No. : "+Mobile);
System.out.println("City : "+City);
}
}
class Student extends Person{
int Prn;
String ClgName;
float Cgpa;

void input2(){
System.out.print("Enter the Prn : ");
Prn=sc.nextInt();
System.out.print("Enter the Clg Name : ");
ClgName=sc.next();
System.out.print("Enter the Cgpa : ");
Cgpa=sc.nextFloat();
}
void output2(){
System.out.println("Prn No. : "+Prn);
System.out.println("College Name : "+ClgName);
System.out.println("Cgpa : "+Cgpa);
}
}
class Employee extends Person{
String EmpId;
int Salary;
void input3(){
System.out.print("Enter the Employee ID : ");
EmpId=sc.next();
System.out.print("Enter the Salary : ");
Salary=sc.nextInt();
}
float CalculateTax(){
float Tax=(Salary*14)/100;
return Tax;
}
void output3(){
System.out.println("Employee ID : "+EmpId);
System.out.println("Salary : "+Salary);
System.out.println("Calculated Tax : "+CalculateTax());

}
}
class Heirarchical{
public static void main(String[] args){
Student s=new Student();
Employee e=new Employee();
System.out.println("\nChoices : ");
System.out.println("1. Student\n2. Employee");
Scanner sca=new Scanner(System.in);
int ch;
System.out.println("Enter the Choice From Above : ");
ch=sca.nextInt();
e.input1();

switch(ch){
case 1 : 
s.input2();
e.output1();
s.output2();
break;
case 2 :
e.input3();
e.output1();
e.output3();
break;
default : 
System.out.println("Wrong Choice.");
break;
}
}
}