import java.util.Scanner;
public class twoquestions 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String q1, q2;
		
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess what it is.");
		System.out.println("");
		System.out.println("Question 1: Is it an animal,vegetable, or mineral?");
		q1=keyboard.next();
		System.out.println("Question 2: Is it bigger than a bread box?");
		q2=keyboard.next();
		
		if(q1=="animal")
		{
			if(q2=="yes")
			{
				System.out.println("Is it a MOOSE?");
			}else
			{
				System.out.println("Is it a SQUIRREL?");
			}
		}
		
		if(q1=="vegetable")
		{
			if(q2=="yes")
			{
				System.out.println("Is it a WATERMELON?");
			}else
			{
				System.out.println("Is it a CARROT?");
			}
		}
		
		if(q1=="mineral")
		{
			if(q2=="yes")
			{
				System.out.println("Is it a CAMARO?");
			}else
			{
				System.out.println("Is it a PAPER CLIP?");
			}
		}
	}
}
