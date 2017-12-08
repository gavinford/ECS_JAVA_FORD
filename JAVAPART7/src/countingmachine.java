import java.util.Scanner;
public class countingmachine 
{
	public static void main(String[]args)
	{
		Scanner keyboard =new Scanner(System.in);
		int countto,n=0;
		System.out.print("Count to: ");
		countto=keyboard.nextInt();
		for(;n<=countto; n++)
		{
			System.out.print(n+" ");
		}
	}
}