import java.util.Scanner;
class Interest{
	double balance;
	static double annualInt;
	Scanner sc=new Scanner(System.in);

	Interest(){
		System.out.println("Enter the Balance : ");
		balance=sc.nextDouble();
	}
	void GetInt(){
		System.out.print("Enter the Interest Rate : ");
		annualInt=sc.nextDouble();
	}
	void monthlyInt(){
		double monthlyInterest=(balance*annualInt/12)/100;
		balance+=monthlyInterest;
	}
	void PrintMonthly(){
		System.out.println("Balance : "+ balance);
	}
}
class InterestFromUserStatic{
	public static void main(String[] args){
	Interest s1=new Interest();
	Interest s2=new Interest();
	s1.GetInt();
	System.out.println("\nAmount At Interest "+ s1.annualInt + "%");
	s1.monthlyInt();
	s1.PrintMonthly();
	s2.monthlyInt();
	s2.PrintMonthly();
	System.out.println("");
	s2.GetInt();
	System.out.println("\nAmount At Interest "+ s2.annualInt + "%");
	s1.monthlyInt();
	s1.PrintMonthly();
	s2.monthlyInt();
	s2.PrintMonthly();
	}
}
