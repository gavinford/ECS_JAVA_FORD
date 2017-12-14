
public class evennessmethod 
{
	public static void main(String[]args)
	{
		for(int r=1;r<100;r++)
		{
			System.out.println();
			System.out.print(r);
			if(testeven(r)==true)
			{
				System.out.print("<");
			}
			if(testthree(r)==true)
			{
				System.out.print("=");
			}
		}
	}
	
	public static boolean testeven(int num)
	{
		if(num%2==0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public static boolean testthree(int num)
	{
		if(num%3==0)
		{
			return true;
		}else
		{
			return false;
		}
	}
}
