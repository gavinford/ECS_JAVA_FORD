import java.util.Random;
public class shorterdoubledice
{
	public static void main(String[] args)
	{
		Random rr = new Random();
		int roll1=1,roll2=2;
		System.out.println("HERE COME THE DICE");
		do
		{
		roll1 = 1+rr.nextInt(6); 
		roll2 =1+rr.nextInt(6);
		System.out.println("Roll #1: "+roll1);
		System.out.println("Roll #2: "+roll2);
		System.out.println("The total is "+(roll1+roll2)+"!");
		}while (roll1 != roll2);
	}
}
