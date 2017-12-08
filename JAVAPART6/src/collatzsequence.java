import java.util.Scanner;
public class collatzsequence 
{
	public static void main(String[]args)
	{
		Scanner keyboard=new Scanner(System.in);
		int num=0;
		System.out.println("Let's create a COLLAT SEQUENCE!");
		System.out.println();
		System.out.println("Rules:");
		System.out.println("If the number is even, divide it by two.");
		System.out.println("If the number is odd, multiply by 3 and add 1.");
		System.out.println("Repeat this decision until your each 1.");
		System.out.println();
		System.out.print("Starting number: ");
		num=keyboard.nextInt();
		System.out.println();
		System.out.print("[ ");
		do
		{
			System.out.print(num);
			if(num%2==0)
			{
				num=(num/2);
			}else
			{
				num=(num*3)+1;
			}
			System.out.print(" - ");
		}while(num>1);
		System.out.print(1+" ]");
		
		
	}
}
