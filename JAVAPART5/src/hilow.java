import java.util.Random;
import java.util.Scanner;
public class hilow 
{
	public static void main(String[] args)
	{
		Random rr = new Random();
		Scanner keyboard = new Scanner(System.in); 
		int num = rr.nextInt(100),response;
		
		System.out.println("I am thinking of a number between 1 and 100. Try to guess it!");
		response=keyboard.nextInt();
		
		if(response>num)
		{
			System.out.println("Sorry, too high! I was thinking of "+num);
		}else if (response<num)
		{
			System.out.println("Sorry, too low! I was thinking of "+num);
		}else
		{
			System.out.println("You guessed it! What are the odds?");
		}
	}
}
