// Kenia Hale
// Hale_ifIsItBigger
// check if bigger

import java.util.Scanner;

public class Hale_ifIsItBigger
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int first;
		int second;
		
		System.out.print("Please enter an integer: ");
		first = reader.nextInt();
		
		System.out.print("Please enter another integer: ");
		second = reader.nextInt();
		
		if ( first > second) // 3 and 2
		{
			System.out.println("First is bigger!");
			double f2s = Math.pow(first,second);
			System.out.printf( "%,d to the power of %,d is %,.4f\n", first, second, f2s); // 9
		}
		else if(first < second)
		{
			System.out.println("Second is bigger!"); // 2 and 3
			double fssqrt = Math.sqrt(first * second);
			System.out.printf("The square root of %,d times %,d equals %,.4f\n", first, second, fssqrt ); //2.4495
				
		}
		else
		{
			System.out.println("They are equal!"); // 2 and 2
			double exp = Math.pow(2, (first * second));
			System.out.printf("2 to the power of %,d equals %,.4f\n", (first * second), exp); // 16			
				
		}
		
		
	}
	
}