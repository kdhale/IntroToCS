// Kenia Hale
// Hale_CarWash
// types of gas, prices, etc etc etc

/*Pseudocode
 *A. Calculate the total bill for gas and/or a car wash at a gas station using decision-making statements(if-else)
 *B. Input: char gasType, double gallonNumb, char carWash
 *C. Output: double totalCost, double washCost, double totalDue
 *D. Constants: double REGPRICE, double SUPERPRICE, double PREMPRICE
 *E. THe program will read and store the user's choices, and ouptup the appropriate amount of gas, cost,etc based off this
 *F. I will use the if/else to direct the user to the different types of gas, then display an error message for else.
 *   within these if/if elses, i will display the price per gallon. I'll use a nested if else to see if the user wants a car
 *   wash, and if they do, then display the cost, which will vary based on the price of their gas. 
 **/



public class Hale_CarWash
{
	public static void main(String [] args)
	{
		KeyboardReader reader = new KeyboardReader();
		char gasType, carWash;
		double costPerGallon = 0;
		double gallonNumb = 0, carWashCost = 0;
		final double REGPRICE = 3.599, SUPERPRICE = 3.699, PREMPRICE = 3.799;
		double gasPrice = 0;
		
		
		gasType = reader.readChar("Enter gas type (R, S, P, or N) and press <Enter>\t");
		
		if (gasType == 'N')
			{
				carWash = reader.readChar("Enter Y or N for car wash and press <Enter>\t\t");
				if (carWash == 'Y')
				{
				carWashCost = 5;
				gallonNumb = 0;
				gasPrice = 0;
				costPerGallon = 0;
				
				
				System.out.printf("\n\nAmount of gasoline purchased:\t\t%,.2f gallons\n", gallonNumb);// 5, or 2
				System.out.println("Price per gallon:\t\t\t$\t" + costPerGallon);// 3.599, 3.699, 3.799
				System.out.printf("\nTotal gasoline cost:\t\t\t$\t%,.2f\n", gasPrice);//18.00 or 7.20, 18.50 or 7.40
				System.out.printf("Car wash cost:\t\t\t\t$\t%,.2f\n",carWashCost);// 3 or 5
				System.out.printf("\nTotal Due:\t\t\t\t$\t%,.2f\n", (carWashCost + gasPrice)); // 21.00 or 12.20, 21.50 or 12.40
				System.out.println("\nTHANK YOU FOR COMING!!");
			
				}
				else
					System.out.println("Have a great day!");
			}
				
		else if (gasType == 'R' || gasType == 'S' ||gasType == 'P')
			{
			gallonNumb = reader.readDouble("Enter number of gallons and press <Enter>\t\t");
			if (gasType == 'R')
				costPerGallon = REGPRICE;		
			else if (gasType == 'S')
				costPerGallon = SUPERPRICE;
			else
				costPerGallon = PREMPRICE;
				
			gasPrice = (gallonNumb * costPerGallon);	
				
			carWash = reader.readChar("Enter Y or N for car wash and press <Enter>\t\t");
			
			if (carWash == 'Y')
			{
			
				if (gasPrice >= 10)
			
				carWashCost = 3;
			
				else 
			
				carWashCost = 5;
			}
			else
				carWashCost = 0;
			
			
			
			System.out.printf("\n\nAmount of gasoline purchased:\t\t%,.2f gallons\n", gallonNumb);// 5, or 2
			System.out.println("Price per gallon:\t\t\t$\t" + costPerGallon);// 3.599, 3.699, 3.799
			System.out.printf("\nTotal gasoline cost:\t\t\t$\t%,.2f\n", gasPrice);//18.00 or 7.20, 18.50 or 7.40
			System.out.printf("Car wash cost:\t\t\t\t$\t%,.2f\n",carWashCost);// 3 or 5
			System.out.printf("\nTotal Due:\t\t\t\t$\t%,.2f\n", (carWashCost + gasPrice)); // 21.00 or 12.20, 21.50 or 12.40
			System.out.println("\nTHANK YOU FOR COMING!!");
				
			}
			
		else
			System.out.println("Error. Please try again.");				
	}
	
}