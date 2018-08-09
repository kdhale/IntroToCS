// Kenia Hale
// Hale_Variable3A
// variable assignment number 3

import java.util.Scanner;

public class Hale_Variable3A
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		double radius;
		double area;
		
		final double PI;
		PI = 3.1415;
		
		System.out.println("What is the radius of the circle?: ");
		radius = reader.nextDouble();
		
		area = PI* radius* radius;
		
		System.out.println("The area of the circle with radius " + radius + " is " + area + ".");
		
	
		
	}
	
}