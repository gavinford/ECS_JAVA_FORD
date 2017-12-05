import java.util.Scanner;
public class spaceboxing 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int weight, planet;
		
		System.out.print("Please enter your current earth weight: ");
		weight =keyboard.nextInt();
		System.out.println("");
		System.out.println("I have information for the following planets:");
		System.out.println("   1. Venus   2. Mars    3. Jupiter ");
		System.out.println("   4. Saturn  5. Uranus  6. Neptune ");
		System.out.println("");
		System.out.print("Which planet are your visiting? ");
		planet=keyboard.nextInt();
		System.out.println("");
		if(planet==1)
		//venus
		{
			System.out.println("Your weight on that planet would be "+(weight*0.78)+".");
		}else if(planet==2)
		//mars
		{
			System.out.println("Your weight on that planet would be "+(weight*0.39)+".");
		}else if(planet==3)
		//jupiter
		{
			System.out.println("Your weight on that planet would be "+(weight*2.65)+".");
		}else if(planet==4)
		//saturn
		{
			System.out.println("Your weight on that planet would be "+(weight*1.17)+".");
		}else if(planet==5)
		//uranus
		{
			System.out.println("Your weight on that planet would be "+(weight*1.05)+".");
		}else
		//neptune
		{
			System.out.println("Your weight on that planet would be "+(weight*1.23)+".");
		}
		
		
	}
}