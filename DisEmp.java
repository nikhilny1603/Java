import java.util.Scanner;
class EmpInfo{
	String Name[]=new String[5];
	float Salary[]=new float[5];
	int EmpId[]=new int[5];
	String City[]=new String[5];
Scanner sc=new Scanner(System.in);
void GetData(){
	System.out.println("\n** Enter the Information of the Employees **\n");
	System.out.println("Enter the Name of the Employees : ");
	for(int i=0;i<5;i++){
		Name[i]=sc.next();
	}
	System.out.println("Enter the Employee ID of the Employees : ");
	for(int i=0;i<5;i++){
		EmpId[i]=sc.nextInt();
	}
	System.out.println("Enter the Salary of the Employees : ");
	for(int i=0;i<5;i++){
		Salary[i]=sc.nextFloat();
	}
	System.out.println("Enter the City of the Employees : ");
	for(int i=0;i<5;i++){
		City[i]=sc.next();
	}
}
void PrintData(){
	System.out.println("\n    ** Employee Information **\n");
	System.out.println("EmpId\tName\tSalary\t\tCity\n");
	for(int i=0;i<5;i++){
		System.out.println(EmpId[i]+"\t"+Name[i]+"\t  "+Salary[i]+"\t\t"+City[i]);
	System.out.println("\n");
		}
	}
}
class DisEmp{
	public static void main(String[] args){
	EmpInfo emp=new EmpInfo();
	emp.GetData();
	emp.PrintData();
}
}
