// Kenia Hale
// Hale_OP5MakingChange
// tell how much change to give

/*Pseudocode
 *
 *Input: double cost and amountPaid
 *Output: change due and int dollars, quarters, nickles, dimes, pennies
 *Constant: none
 *
 *Summary: read in cost and amountDue, use variable change, as well as casting, to find amounts of coins needed by deviding change by the decimal value of each coin, then find remaining multiply each by it's decimal value to find remaining change amount, keep changing value of change throughout till reach zero
 **/

import java.util.Scanner;

public class Hale_OP5MakingChange
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		double cost;				// 1.32
		double amountPaid;			// 5.00
		int dollars, quarters, nickles, pennies, dimes;
			
		
		System.out.print("Enter purchace price:  $");
		cost = reader.nextDouble();
		
		System.out.print("Enter amount recieved: $");
		amountPaid = reader.nextDouble();
		
		double change = (amountPaid - cost);	//3.68 = 5.00
		System.out.printf("Change due: $%.2f\n\n", change);
		dollars = (int)change;					//3 = (int) 3.68
		change = change - dollars;				// .68 = 3.68 - 3 
		quarters = (int)(change / .25);			// 2 = (int) (.68 / .25 )
		change = change - (quarters * .25);		// .18 = .68 - .50
		dimes = (int) (change / .10);			// 1 = (int) (.18 / .1)
		change = change - (dimes * .10);		// .08 = .18 - .10
		nickles = (int) (change / .05);			// 1 = (int) (.08 / .05)
		change = change - (nickles * .05);		// .03 = .08 - .05
		pennies = (int) (change / .01);			// 3 = (int) (.03 / .01)
		
		System.out.println("Breakdown: \n");
		System.out.println(" Dollars:  " + dollars);
		System.out.println(" Quarters: " + quarters);
		System.out.println(" Dimes:    " + dimes);
		System.out.println(" Nickles:  " + nickles);
		System.out.println(" Pennies:  " + pennies);
		
			 
		
		
		
		
		
		
		
		
	}
	
}