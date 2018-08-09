// Kenia Hale
// Hale_PersInfoBONUS
// display info about meeeeeeee

import java.util.Scanner;

public class Hale_PersInfoBONUS
{
	public static void main(String[] args)
	{
		
		Scanner reader = new Scanner(System.in);
		
		String name;
		String address;
		String csz;
		String email;
		String area;
		String grade;
		String comp;
		String college;
		String color;
		String numb;
		String tv;
		
		System.out.print ("Enter your name (a string of letters): ");
		name = reader.nextLine();
		
		System.out.print ("What's your address????: ");
		address = reader.nextLine();
		
		System.out.print ("What is your City, State, and Zip?: ");
		csz = reader.nextLine();
		
		System.out.print ("What is your area code and phone number?: ");
		area = reader.nextLine();
		
		System.out.print ("What is your email?: ");
		email = reader.nextLine();
		
		System.out.print ("What is your grade?: ");
		grade = reader.nextLine();
		
		System.out.print ("What type of computer do you have?: ");
		comp = reader.nextLine();
		
		System.out.print ("What college do you like?: ");
		college = reader.nextLine();
		
		System.out.print ("What's your favorite color?: ");
		color = reader.nextLine();
		
		System.out.print ("What's your favorite number?: ");
		numb = reader.nextLine();
		
		System.out.print ("What is your favorite tv show?: ");
		tv = reader.nextLine();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Name:                               "+ name);
		System.out.println("Address:                            "+ address);
		System.out.println("City, State, Zip:                   "+ csz);
		System.out.println("Area code and Phone Number:         "+ area);
		System.out.println("E-mail address:                     "+ email);
		System.out.println("Grade in School:                    "+ grade);
		System.out.println("Type of computer you have at home:  "+ comp);
		System.out.println("College/University you like:        "+ college);
		System.out.println("Favorite color:                     "+ color);
		System.out.println("Favorite number:                    "+ numb);
		System.out.println("Favorite TV show:                   "+ tv);
		System.out.println();
		System.out.println();
	
		
	}
	
}