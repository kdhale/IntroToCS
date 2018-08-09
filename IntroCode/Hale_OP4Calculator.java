// Kenia Hale
// Hale_OP4Calculator
// calculating sum,difference,average,product


import java.util.Scanner;

public class Hale_OP4Calculator
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int num1;
		int num2;
		int sum;
		int product;
		int diff;
		double ave;
		
		System.out.print("Please enter an integer: ");
		num1 = reader.nextInt();
		
		System.out.print("Please enter another integer: ");
		num2 = reader.nextInt();
		
		System.out.println();
		
		System.out.println("Original numbers are " + num1 + " and " + num2 + ".");
		System.out.println();
		
		sum = (num1 + num2);
		diff = (num1 - num2);
		product = (num1 * num2);
		ave = ((double)(num1 + num2)/2);
		
		System.out.println("Sum =             " + sum);
		System.out.println("Difference =      " + diff);
		System.out.println("Product =         " + product);
		System.out.println("Average =         " + ave);
		
		System.out.println();
		
		
	}
	
}