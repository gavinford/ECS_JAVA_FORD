import java.util.Scanner;
public class countingfor2 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What would you like me too repeat?");
		System.out.print("Message: ");
		String message = keyboard.nextLine();
		
		
		for (int n=2; n<=20;n=n+3)
		{
			System.out.println(n+". "+message);
			
		}
	}
}