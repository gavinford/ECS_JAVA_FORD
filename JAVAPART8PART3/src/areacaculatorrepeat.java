import java.util.Scanner;
public class areacaculatorrepeat 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println();
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");
		System.out.print("Which Shape:");
		int shape=keyboard.nextInt();
		System.out.println();
		if(shape==1)
		{
			radtriangle();
			main(null);
		}else if(shape==2)
		{
			radrect();
			main(null);
		}else if(shape==3)
		{
			radsquare();
			main(null);
		}else if(shape==4)
		{
			radcircle();
			main(null);
		}else if(shape==5)
		{
			quit();
		}else
		{
			System.out.println("Invalid number!");
			main(null);
		}
		
	}
	
	public static void radtriangle()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Base: ");
		int base=keyboard.nextInt();
		System.out.println();
		System.out.print("Height: ");
		int height=keyboard.nextInt();
		System.out.println("The area is "+((base*height)/2));
	}
	
	public static void radrect()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Width: ");
		int base=keyboard.nextInt();
		System.out.println();
		System.out.print("Height: ");
		int height=keyboard.nextInt();
		System.out.println("The area is "+(base*height));
	}
	
	public static void radsquare()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Side Length: ");
		int sidelength=keyboard.nextInt();
		System.out.println("The area is "+(sidelength*sidelength));
	}
	
	public static void radcircle()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Radius: ");
		int radius=keyboard.nextInt();
		System.out.println("The area is "+(Math.PI*(radius*radius)));
	}
	
	public static void quit()
	{
		System.out.println("Goodbye!");
		System.out.println("----------------------------------------------");
		System.out.println("Shape Area Calculator (c) 2017 Gavin Ford ECS");
	}
}
