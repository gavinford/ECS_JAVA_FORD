package javapart3;
import java.util.Scanner;
public class nameagesalary 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		double salaryph;
		
		System.out.println("Hello. What's your name?");
		name=keyboard.next();
		
		System.out.println("Hey, "+name+"! how old are you?");
		age=keyboard.nextInt(); 
		
		System.out.println("So you are "+age+"? I guess that's not too old, "+name+". How much do you make per hour?");
		salaryph=keyboard.nextDouble();
		
		System.out.println("Wow, "+salaryph+" is a lot for your age.");
	}
	
}