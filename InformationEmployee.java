class Employee{
	String name;
	int empId;
	int salary;
	String city;

	Employee(String n,int id,int sal,String c){
		this.name=n;
		this.empId=id;
		this.salary=sal;
		this.city=c;
	}
	void print(){
		System.out.println("Information of Employee  ");
		System.out.println("Name : "+ name);
		System.out.println("Employee ID : "+ empId);
		System.out.println("Salary : "+ salary);
		System.out.println("City : "+ city);

	}
}

class InformationEmployee{
	public static void main(String[] args){
	Employee e=new Employee("Nikhil",133,142543,"Ichalakranji");
	e.print();
	}
}