package javapart3;
import java.util.Scanner;
public class agein5 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("Hello. What's your name?");
		name = keyboard.next();
		
		System.out.println("Hey, "+name+"! How old are you?");
		age = keyboard.nextInt();
		
		System.out.println("Did you know that in 5 years you will be "+(age+5)+" years old, and 5 years ago you were "+(age-5)+"! Imagine that!");
			
	}
}