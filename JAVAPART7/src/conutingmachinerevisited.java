import java.util.Scanner;
public class conutingmachinerevisited
{
	public static void main(String[]args)
	{
		Scanner keyboard =new Scanner(System.in);
		int countto,countfrom,countby;
		System.out.print("Count from: ");
		countfrom=keyboard.nextInt();
		System.out.print("Count to: ");
		countto=keyboard.nextInt();
		System.out.print("Count by: ");
		countby=keyboard.nextInt();
		
		for(int n=countfrom;n<=countto; n+=countby)
		{
			System.out.print(n+" ");
		}
	}
}