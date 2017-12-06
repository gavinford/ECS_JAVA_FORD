import java.util.Random;
public class dice 
{
	public static void main(String[] args)
	{
		Random rr = new Random();
		int roll1 = rr.nextInt(6), roll2=rr.nextInt(6);
		System.out.println("HERE COME THE DICE");
		System.out.println("Roll #1: "+roll1);
		System.out.println("Roll #2: "+roll2);
		System.out.println("The total is "+(roll1+roll2)+"!");
	}
}
