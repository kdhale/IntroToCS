// Kenia Hale
// Hale_VariableBONUS
// bonus variable assignment, with 10 ints that are summed 

import java.util.Scanner;

public class Hale_VariableBONUS

{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int one;
		int two;
		int three;
		int four;
		int five;
		int six;
		int seven;
		int eight;
		int nine;
		int ten;
		
		System.out.print("Please enter an integer: ");
		one = reader.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter an integer: ");
		two = reader.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter an integer: ");
		three = reader.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter an integer: ");
		four = reader.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter an integer: ");
		five = reader.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter an integer: ");
		six = reader.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter an integer: ");
		seven = reader.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter an integer: ");
		eight = reader.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter an integer: ");
		nine  = reader.nextInt();
		
		System.out.println();
		
		System.out.print("Please enter an integer: ");
		ten = reader.nextInt();
		
		System.out.println();
		
		System.out.println("The integers you entered were: " + "\n\n" + one + "\n" + two + "\n" +
			 three + "\n" + four + "\n" + five + "\n" + six + "\n" + seven + "\n" + eight + "\n" + nine + "\n" + ten);
			 
		System.out.println();
		
		System.out.println("The sum of the integers you entered is: " + (one + two + three + four + five + six + seven + eight + nine + ten));
		
		System.out.println();
		
		System.out.println("The product of the integers you entered is: " + (one * two * three * four * five * six * seven * eight * nine * ten));
		
		System.out.println();
	}
	
}