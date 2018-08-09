// Kenia Hale
// Hale_ifFollowingDirections
// does the reader follow directions????

import java.util.Scanner;

public class Hale_ifFollowingDirections
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Please enter an integer between 1 and 50: ");
		int numb = reader.nextInt();
		
		if (numb >= 1 && numb <= 50)
		{
			double sqrt = Math.sqrt( numb );
			System.out.println();
			System.out.println("Congrats on following directions! Good job, Bub!");
			System.out.println();
			System.out.printf("The square root of %,d is %,.4f.\n",numb, sqrt);
		}
		else
		{
			System.out.println();
			System.out.println("You FOOL!!! YOU Have FAILEDDDD" );
			System.out.println();
		}
	}
}