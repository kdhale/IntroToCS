// Kenia Hale
// Hale_Parking
// type of vehical, parking cost, hours

/*Pseudocode
 *A. Calculate the total bill after parking in the pentagon
 *B. Input: int parkMins, char vehiType
 *C. Output: double cost, int hours
 *D. Constants: none?
 *E. The program will store the reader's vehical type and time in variables, and use a nested if else to display the cost and hours
 *F. I first calculate the time in hours and store it in a variable, then will use nested if else to find the price based on:
 *	 1: what kind of vehical they have if , and 2: how long they were parked. 
 **/



public class Hale_Parking
{
	public static void main(String [] args)
	{
		KeyboardReader reader = new KeyboardReader();
		
		int parkMins = 0;
		char vehiType;
		double cost = 0;
		
		
		vehiType = reader.readChar("Please enter vehical type (C)ar, (T)ruck, (S)eniors: \t");
		
		
		if(vehiType == 'C' || vehiType == 'S' || vehiType == 'T')
		{
			//parkMins = reader.readInt("Please enter minutes parked:\t\t\t\t");
		
			//int hours = (parkMins/60);
			
		//	if(parkMins%60 != 0)
			//	hours = hours + 1;
		
			if(vehiType == 'C')
			{
				parkMins = reader.readInt("Please enter minutes parked:\t\t\t\t");
				int hours = (parkMins/60);
			
				if(parkMins%60 != 0)
					hours = hours + 1;
				if (hours <= 2)
				{
					cost = 0;
				}
				else if(hours <= 5) // as soon as one is true, will skip over rest
				{
					cost = (hours - 2) * .5;
				}
				else if(hours <= 15)//6 to 15 hours
				{
					cost = (.25 * (hours - 5)) + 1.5;
				}
				else
				System.out.println("You're gonna be towed!! MWAHAHAHA!!!");
				
				if(hours <= 15)
				{
					System.out.printf("You will be charged $%,.2f for %,d hours.\n", cost, hours); 
				}					
			}
		
			else if(vehiType == 'T')
			{
				parkMins = reader.readInt("Please enter minutes parked:\t\t\t\t");
				int hours = (parkMins/60);
			
				if(parkMins%60 != 0)
					hours = hours + 1;
				
				if(hours <= 1)
				cost = 0;
				else if(hours <= 3)
				cost = (1 * (hours - 1));
				else if(hours <= 15)
				cost = (.75 * (hours - 3) + 2);
				else
					System.out.println("You're gonna be towed!!!");	
				if(hours <= 15)
				{
					System.out.printf("You will be charged $%,.2f for %,d hours.\n", cost, hours); 
				}						
			}
		
			else
			{
			System.out.println("You're a senior. You don't have to pay!");	
			}
		
		}
		else
		{
			System.out.println("Error. Please try again.");
		}		
		
	}
}		

	
