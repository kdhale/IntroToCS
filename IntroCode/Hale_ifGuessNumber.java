// Kenia Hale
// Hale_ifGuessNumber
// guess a number

import java.util.Scanner;

public class Hale_ifGuessNumber
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		final int SECRET = 5;
		int guess;
		
		System.out.print("Guess an integer between 1 and 20!: ");
		guess = reader.nextInt();
		
		if(guess == SECRET)
		{
			System.out.println("Hey! That was correct! Are you psychic????");
		}
		else
		{
			if(guess == SECRET + 1 || guess == SECRET + 2 || guess == SECRET - 1 || guess == SECRET - 2)
			{
				System.out.println("Incorrect, but a nice guess!");
			}
			else
			{
				System.out.println("Incorrect, and a lousy guess!");
			}
		}
		
			
	}
}