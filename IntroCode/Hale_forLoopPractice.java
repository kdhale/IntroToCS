// Kenia Hale
// Hale_forLoopPractice
// working with switch structures

/*Psuedocode for 7
 *Input: int start, end
 *Output: sum, diff, val, i
 *Usage: read in start and end, then subtract start from end to find diff, then use a for loop, for(i = diff; i >= 0; i--), to find each less number between the two, set val equal to end - i then
 *			add that to sum by doing sum = val + sun, then when that loop finishes running, present it to the screen
 *
 *Psuedocode for 8
 *Input: num, val	
 *Output: i, max, min, sum
 *Usage: read in num, create a for loop that keeps running while i <= num, then read in a val for each. everytime, add new val to sum. max = Math.max(val,math) to find max, then for min, put the first number in for min, 
 *			and every time, check if next val is less than that, and if it is, then set that equal to min. output all to screen
 */

public class Hale_forLoopPractice
{
	public static void main(String [] args)
	{
		KeyboardReader reader = new KeyboardReader();
		
		
		int choice = 1000000000;
		while (choice != 9)
		{
				System.out.println("\nWelcome to my menu. Please select from the following options:\n\n"
				+ "\t 1. For Loop Practice 1\n"
				+ "\t 2. For Loop Practice 2\n"
				+ "\t 3. For Loop Practice 3\n"
				+ "\t 4. For Loop Practice 4\n"
				+ "\t 5. For Loop Practice 5\n"
				+ "\t 6. For Loop Practice 6\n"
				+ "\t 7. For Loop Practice 7\n"
				+ "\t 8. For Loop Practice 8\n"
				+ "\t 9. Exit\n");
				
			choice = reader.readInt("Enter your selection (1-8): ");
		
			switch(choice)
			{
				case 1:
					int i;
					for(i = 10; i >= 1; i--)
					{
						System.out.print(i + " ");
					}
					break;
				case 2:
					
					for(i = 10; i <= 30 ; i += 2)
					{
						System.out.print(i + " ");
					}
					break;
				case 3:
					for(i = 1; i <= 10 ; i ++)
					{
						System.out.println(i + "    " + i*i);
					}
					break;
				case 4:
					for(i = 0; i <= 11 ; i++)
					{
						System.out.println(i + "   " + i*9);
					}
					break;
				case 5:
					for(i = 0; i <= 5 ; i++)
					{
						//int val = 3*Math.pow(2,i);
						if(i < 5)
							System.out.print( 3*(int)Math.pow(2,i) + ", ");
						else
							System.out.println( 3*(int)Math.pow(2,i));
						
					}
					break;
				case 6:
					for(i = 8; i >= 0 ; i--)
					{		
							System.out.print((int)Math.pow(2,i) + "  ");		
					}
					break;
				case 7:
					int start, end, sum = 0, diff, val;
					start = reader.readInt("Please enter the starting number:\t\t");
					end = reader.readInt("Please enter the ending number:\t\t\t");
					diff = end - start;
					for(i = diff; i >= 0; i--)//find each less number
					{		
						val = end - i;
						sum = val + sum;
					}
					System.out.println("\nThe sum of the integers between " + start + " and " + end + " is " + sum + ".");
					break;
				case 8:
					int num, max = 0, min = 0;
					sum = 0;
					num = reader.readInt("How many numbers would you like to enter?\t");
					for(i = 1; i <= num; i++)
					{
						val = reader.readInt("\nPlease enter number " + i + ":\t\t\n");
						sum = val + sum;
						max = Math.max(max,val);
						
						if(i == 1)
						{
							min = val;
						}
						if (val < min)
						{
							min = val;
						}
					}
					System.out.println("\nANWSERS"
							+ "\n\tSum:        " + sum
							+ "\n\tMaximum:    " + max
							+ "\n\tMinimum:    " + min);
					break;
				case 9:
					System.out.println("Goodbye.");
					break;
				default:
					System.out.println("I know you can do better than this bub.");
			}//ends switch
			
			reader.pause();
					
		}//ends while
			
	}//ends main
	
}