import java.util.Scanner;
public class calculator 
{
	public static void main(String[]args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.println("This is your calculator!");
		System.out.println("Insert your calulation as \"### operator ###\"");
		int num1=keyboard.nextInt();
		String opp=keyboard.next();
		int num2=keyboard.nextInt();
		double answer=0;
		if(opp.equals("+"))
		{
			answer=add(num1, num2);
			System.out.println(answer);
		}else if(opp.equals("-"))
		{
			answer=subtract(num1,num2);
			System.out.println(answer);
		}else if(opp.equals("/"))
		{
			answer=divide(num1,num2);
			System.out.println(answer);
		}else if(opp.equals("*"))
		{
			answer=multiply(num1,num2);
			System.out.println(answer);
		}else if(opp.equals("^"))
		{
			answer=power(num1,num2);
			System.out.println(answer);
		}else
		{
			System.out.println("Unknown Operator\""+opp+"\"");
		}
	}
	
	public static int add(int number1,int number2)
	{
		int ans=(number1+number2);
		
		return ans;
	}
	
	public static int subtract(int number1,int number2)
	{
		int ans=(number1-number2);
		
		return ans;
	}
	
	public static int divide(int number1,int number2)
	{
		int ans=(number1/number2);
		
		return ans;
	}
	
	public static int multiply(int number1,int number2)
	{
		int ans=(number1*number2);
		
		return ans;
	}
	
	public static double power(int number1,int number2)
	{
		double ans=Math.pow(number1,number2);
		
		return ans;
	}
}
