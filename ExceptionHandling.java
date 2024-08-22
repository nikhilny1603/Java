import java.util.Scanner;
class ExceptionHandling{
	public static void main(String[] args){
	System.out.println("Program Started.");
	Scanner sc=new Scanner(System.in);
		int []marks=new int[5];
		int divisor;
		System.out.println("Enter the Elements of the Array : ");
		for(int i=0;i<5;i++){
		marks[i]=sc.nextInt();
	}
		System.out.println("Enter the Divisor : ");
		divisor=sc.nextInt();
		int arr[]=new int[5];
	try{
		for(int i=0;i<5;i++){
		arr[i]=marks[i]%divisor;
		System.out.println("After Dividing the Array Elements : ");
		for(int i=0;i<5;i++){
		System.out.println(arr[i]);
	}
	}
}
	catch(java.lang.Exception e){
		System.out.println("Exception Occured Because You Entered Divisor Zero.");
}
		System.out.println("Program Ended.");
	}
}