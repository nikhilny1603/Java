import java.util.Scanner;

class Matrix{
	int A[][]=new int[2][2];
	int B[][]=new int[2][2];
Scanner sc=new Scanner(System.in);
void GetEle(){
	System.out.println("Enter the Elements of 1st Matrix :");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				A[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter the Elements of 2nd Matrix :");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				B[i][j]=sc.nextInt();
			}
		}
	}	
void PrintMatrix(){
	System.out.println("Elements of 1st Matrix Are : \n");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(A[i][j]+ " ");
				
			}System.out.println();

		}
	System.out.println("Elements of 2nd Matrix Are : \n");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(B[i][j]+ " ");
				
			}System.out.println();

		}
	}	
void Add(){
	System.out.println("Addtion of Matrices Are : \n");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(A[i][j]+B[i][j]+ " ");
				
			}
System.out.println();
		}
	}
void Sub(){
	System.out.println("Subtraction of Matrices Are : \n");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(A[i][j]-B[i][j]+ " ");
				
			}
			System.out.println();
		}

	}
int C[][]=new int[2][2];
void Mult(){
	System.out.println("Multiplication of Matrices Are : \n");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
			C[i][j]=0;
				for(int k=0;k<2;k++){
					C[i][j]+=A[i][k]*B[k][j];
				}
					System.out.print(C[i][j]+ " ");
			}
				System.out.println();			
		}

	}
}
class Matrix1{
	public static void main(String[] args){
	Matrix M=new Matrix();
	M.GetEle();
	M.PrintMatrix();
	M.Add();
	M.Sub();
	M.Mult();
}
}