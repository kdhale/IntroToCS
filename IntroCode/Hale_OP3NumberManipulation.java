// Kenia Hale
// Hale_OP3NumberManipulation
// Magic with numbers!!!

/*Pseudocode
 *
 *Input: int someDigit
 *Output: int timesNine and int finalNumb
 *Constant: final int MAGICNUMB = 12345679
 *
 *Summary: read in int someDigit, use timesNine = (9 * someDigit) and finalNumb = (timesNine * MAGICNUMB), display finalNumb
 **/

import java.util.Scanner;

public class Hale_OP3NumberManipulation
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int someDigit;
		int timesNine;
		int finalNumb;
		
		final int MAGICNUMB = 12345679;
		
		System.out.print("Plese enter an integer from 1 to 9: ");
		someDigit = reader.nextInt();
		
		System.out.println();
		System.out.println();
		
		System.out.println("          " + someDigit);
		System.out.println("X         9");
		System.out.println("____________");
		
		timesNine = (9 * someDigit);
		
		System.out.println("          " + timesNine);
		
		System.out.println();
		System.out.println("X         " + MAGICNUMB);
		System.out.println("___________________");
		
		finalNumb = (timesNine * MAGICNUMB);
		
		System.out.println("          " + finalNumb);
		
		
		
		
		
	}
	
}