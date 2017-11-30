package variables;

public class morevariablesandprinting 
{
	public static void main(String[] args)
	{
		String myname, myeyes, myteeth, myhair;
		int myage, myheight, myweight;
		
		myname = "Zed A. Shaw";
		myage = 35;
		myheight = 74;
		myweight = 180;
		myeyes = "Blue";
		myteeth = "White";
		myhair = "Brown";
		
		System.out.println("Let's talk about "+myname+".");
		System.out.println("He's "+myheight+" inches tall.");
		System.out.println("He's "+myweight+" pounds heavy.");
		System.out.println("Actually, thats not too heavy.");
		System.out.println("He's got "+myeyes+" eyes and "+myhair+" hair.");
		System.out.println("His teeth are usually "+myteeth+" depending on the coffee.");
		
		System.out.println("If I add "+myage+", "+myheight+", and "+myweight+" I get "+(myage+myheight+myweight)+".");
	}

}
