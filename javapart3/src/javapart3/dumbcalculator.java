package javapart3;
import java.util.Scanner;

public class dumbcalculator 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int one,two,three;
		
		System.out.println("Let's find the averages of a few numbers...");
		System.out.println("");
		System.out.print("What is the first number? ");
		one=keyboard.nextInt();
		System.out.print("What is the second number? ");
		two=keyboard.nextInt();
		System.out.print("What is the third number? ");
		three=keyboard.nextInt();
		System.out.println("The average of the three numbers is "+((one+two+three)/3));
		
	}
}
