import java.util.Random;
import java.util.Scanner;
public class hilowlimited
{
	public static void main(String[] args)
	{
		Random rr = new Random();
		Scanner keyboard = new Scanner(System.in); 
		int attempts=0,num = 1+rr.nextInt(100),response=200;
		
		System.out.println("I am thinking of a number between 1 and 100. Try to guess it!");
		while(attempts<7)
		{
			response=keyboard.nextInt();
			if(response>num)
			{
				System.out.println("Sorry, too high!");
				attempts++;
			}else if (response<num)
			{
				System.out.println("Sorry, too low!");
				attempts++;
			}else
			{
				System.out.println("You guessed it! What are the odds?");
			}
		}
		
		System.out.println("Sorry, you didn't get it in 7 tries! Youe Lose!");
	}
}
