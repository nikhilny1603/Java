import java.util.Scanner;

class exception
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.println("ENTER THE NUMERATOR AND DENOMINATOR FOR DIVISION :\n");
			int num = sc.nextInt();
			int den = sc.nextInt();

			if(den == 0)
			{
				throw new Exception("ACCESS DENIED !");
			}
			else
			{
				double result = num / den ;
				System.out.println("THE RESULT OF DIVISION IS :" + result);
			}
		}
		catch(Exception e)
		{
			System.out.println("DENOMINATOR CAN NOT BE ZERO !");
		}
		finally
		{
			System.out.println("THE TRY AND CATCH BLOCK IS PERFORMED. NOW IS IN FINALLY.");
		}
	}
}