
import java.util.Random;
import java.util.Scanner;

public class keepguessing
{
	public static void main ( String[] args )
	{
		Random rr = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int num=1+rr.nextInt(10),guess = 11;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		while (guess != num)
		{
		System.out.print("Your Guess:");
		guess=keyboard.nextInt();
		if (guess != num)
		{
			System.out.println("That's not right! Keep Guessing!");
		}
		}
		System.out.println("That's Right! You're a good guesser!");
	}
}