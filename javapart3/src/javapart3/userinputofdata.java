package javapart3;
import java.util.Scanner;

public class userinputofdata 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String namefirst, namelast, login;
		int grade, id;
		Double gpa;
		
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println("");
		System.out.print("First Name: ");
		namefirst = keyboard.next();
		
		System.out.print("Last Name: ");
		namelast=keyboard.next();
		
		System.out.print("Grade: ");
		grade=keyboard.nextInt();
		
		System.out.print("Student ID: ");
		id=keyboard.nextInt();
		
		System.out.print("Login: ");
		login=keyboard.next();
		
		System.out.print("GPA: ");
		gpa=keyboard.nextDouble();
		
		System.out.println("");
		System.out.println("Your Information:");
		System.out.println("     Login: "+login);
		System.out.println("     ID: "+id);
		System.out.println("     Name: "+namelast+","+namefirst);
		System.out.println("     GPA: "+gpa);
		System.out.println("     Grade: "+grade);
		
		
	}
}
