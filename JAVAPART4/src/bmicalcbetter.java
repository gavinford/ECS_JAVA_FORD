import java.util.Scanner;
public class bmicalcbetter 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int weight, feet, inches;
		double bmi;
		System.out.println("BMI Body Mass Index is a way of representing your size");
		System.out.println("");
		System.out.println("How many feet tall are you ?");
		feet=keyboard.nextInt();
		System.out.println("How many inches ?");
		inches=keyboard.nextInt();
		System.out.println("How many pounds do you weigh?");
		weight=keyboard.nextInt();
		System.out.println("");
		System.out.println("Your BMI is: "+(weight*0.4536)/((feet*0.3048+inches*0.0254)*(feet*0.3048+inches*0.0254)));
		bmi = (weight*0.4536)/((feet*0.3048+inches*0.0254)*(feet*0.3048+inches*0.0254));
		System.out.println("");
		
		if(bmi<18.5)
		{
			System.out.println("You are underweight.");
		}else if(bmi>=18.5&&bmi<=24.9)
		{
			System.out.println("You are normal weight.");
		}else if(bmi>=25&&bmi<=29.9)
		{
			System.out.println("You are overweight.");
		}else
		{
			System.out.println("You are obese.");
		}
		
	}
}
