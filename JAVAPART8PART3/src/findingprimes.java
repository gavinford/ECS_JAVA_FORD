import java.util.Scanner;
public class findingprimes 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("We are going to find some Primes!");
		System.out.println("What range would you like them in?");
		System.out.println("(only positive integers 2 or greater)");
		System.out.println();
		System.out.print("Low end: ");
		int low=keyboard.nextInt();
		System.out.print("High end: ");
		int high=keyboard.nextInt();
		System.out.println();
		
		for(int n=low; n<=high;n++)
		{
			if(testprime(n)==true)
			{
				System.out.println(n+" <");
			}else
			{
				System.out.println(n);
			}
			
		}
	}
	
	public static boolean testprime(int nn)
	{
		if(nn%2==0) return false;
		for(int i=2;i<nn;i++)
		{
			if(nn%i==0)
			{
				return false;
			}
		}
		return true;
	}
}