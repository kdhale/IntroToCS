// Kenia Hale
// Hale_ifNames
// check names? same? 

import java.util.Scanner;

public class Hale_ifNames
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		String name = "Kenia";
		String lastname = "Hale";
		String username;
		String userlastname;
		
		System.out.print("What's your first name? (Capitalize the first letter): ");
		username = reader.nextLine();
		
		System.out.print("What's your last name? (Capitalize the first letter): ");
		userlastname = reader.nextLine();
		
		if (username.equals(name) && userlastname.equals(lastname))
		{
			System.out.println("Hey! We have the same first and last names! Wowzer!");
		}
		else if (username.equals(name) && !userlastname.equals(lastname))
		{
			System.out.println("Hey! We have the same first name! Wha????!");
		}
		else if (!username.equals(name) && userlastname.equals(lastname))
		{
			System.out.println("Hey! We have the same last name! Are we related????!");
		}
		else
		{
			System.out.println("We don't have the same last name or first name. Bummer :( ");
		}
			
			
			
	}
	
}