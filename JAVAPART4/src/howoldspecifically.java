import java.util.Scanner;
public class howoldspecifically 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.println("Hey, what's your name?");
		name=keyboard.next();
		System.out.println("Ok "+name+", how old are you?");
		age=keyboard.nextInt();
		if(16>age)
		{
			System.out.println("You cannot drive.");
		}else if(age>=16&&age<=17)
		{
			System.out.println("You can drive but not vote.");
		}else if(age>=18&&age<=24)
		{
			System.out.println("You can vote but not rent a car.");
		}else
		{
			System.out.println("You can pretty much do whatever you want.");
		}
		
	}
}
