// Kenia Hale
// Hale_OP1SpeedingFines
// fine of speeding ticketts

/* Psuedocode
 *Input: int SpeedLim and int UserSpeed
 *Output: int fine
 *Constant: final int FIXEDFINE
 *
 *Outline: read in SpeedLim and UserSpeed, use fine = Fixedfine + ((SpeedLim - UserSpeed)* 5) to calculate fine, display fine*/

import java.util.Scanner;

public class Hale_OP1SpeedingFines
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int SpeedLim;
		int UserSpeed;
		
		System.out.print("Please enter the speed limit:           ");
		SpeedLim = reader.nextInt();
		
		System.out.print("Plese enter the vehicle speed:          ");
		UserSpeed = reader.nextInt();
		
		final int FIXEDFINE = 20;
		
		System.out.println();
		
		System.out.println("The fine will be:                      $" + (FIXEDFINE + (UserSpeed - SpeedLim)* 5));
		
		
	}
	
}