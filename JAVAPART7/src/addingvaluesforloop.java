import java.util.Scanner;
public class addingvaluesforloop
{
	public static void main(String[]args)
	{
		Scanner keyboard =new Scanner(System.in);
		int countto,n=1,sum=0;
		System.out.print("Number: ");
		countto=keyboard.nextInt();
		for(;n<=countto; n++)
		{
			sum+=n;
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("The sum is "+sum);
	}
}