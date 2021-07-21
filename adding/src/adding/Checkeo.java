package adding;
import java.util.Scanner;
 class Checkeo 
{

	public static void main(String args[]) 
	{
		int N;
		System.out.println("Enter number:");
		Scanner input = new Scanner(System.in);
		N=input.nextInt();
		
		
		if (N%2==0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}

}
