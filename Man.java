import java.util.Scanner;
interface Person{
	void input();
	void print();
}
class Man implements Person{
	String name;
	int age;
	String city;
	int mobile;
	Scanner sc=new Scanner(System.in);
	public void input(){
		System.out.print("Enter the Name : ");
		name=sc.next();
		System.out.print("Enter the Age : ");
		age=sc.nextInt();
		System.out.print("Enter the City : ");
		city=sc.next();
		System.out.print("Enter the Mobile Number : ");
		mobile=sc.nextInt();
	}
	public void print(){
		System.out.println("Name : "+name+"\nAge : "+age+"\nCity : "+city+"\nMobile : "+mobile);
	}
public static void main(String[] args){
	Person p=new Man();
	p.input();
	System.out.println("\n* Information *");
	p.print();
	}
}