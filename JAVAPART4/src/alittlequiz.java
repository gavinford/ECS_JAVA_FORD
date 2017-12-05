import java.util.Scanner;
public class alittlequiz 
{
	public static void main(String[] args)
	{
		int score, a1, a2, a3;
		Scanner keyboard = new Scanner(System.in);
		score = 0;
		
		System.out.println("Q1 What is the capital of Alaska?");
		System.out.println("    1: Melborne");
		System.out.println("    2: Anchorage");
		System.out.println("    3: Juneau");
		a1=keyboard.nextInt();
		if(a1==3)
		{
			System.out.println("That's Right!");
			score += 1;
		}else
		{
			System.out.println("Incorrect!");
		}
		
		System.out.println("Q2 Can you store the value \"cat\" in a variable of type int?");
		System.out.println("    1: Yes");
		System.out.println("    2: No");
		a2=keyboard.nextInt();
		if(a2==2)
		{
			System.out.println("That's Right!");
			score += 1;
		}else
		{
			System.out.println("Incorrect!");
		}
		
		System.out.println("Q3 What is the result of 9+6/3?");
		System.out.println("    1: 5");
		System.out.println("    2: 11");
		System.out.println("    3: 15/3");
		a3=keyboard.nextInt();
		if(a3==2)
		{
			System.out.println("That's Right!");
			score  +=1;
		}else
		{
			System.out.println("Incorrect!");
		}
		System.out.println("");
		System.out.println("Overall, you got "+score+" out of 3 correct!");
		System.out.println("Thanks for playing!");
		
	}
}
