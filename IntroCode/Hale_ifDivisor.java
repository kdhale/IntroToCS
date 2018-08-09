// Kenia Hale
// Hale_ifDivisor
// even or odd?

import java.util.Scanner;

public class Hale_ifDivisor
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int numb;
		int divisor;
		
		System.out.print("Please enter a number (integer): ");
		numb = reader.nextInt();
		
		System.out.print("Please enter a divisor (integer): ");
		divisor = reader.nextInt();
		
		int d = numb%divisor;
		int r = numb / divisor;
		
		if ( d == 0)
		{
			System.out.println("This is an even divison. " + numb + " devided by " + divisor + " equals " + r + ". Wowzer!");
		}
		
		else 
		{
			System.out.println("This is NOT an even division. Yikes!");
		}
			
			
			
	}
	
}