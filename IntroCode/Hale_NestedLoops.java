// Kenia Hale
// Hale_NestedLoops
// working with loops, making shapes, etc!

public class Hale_NestedLoops
{
	public static void main(String [] args)
	{
		KeyboardReader reader = new KeyboardReader();
		
		int choice = 1000000000;
		do 
		{
			int j = 0, x = 0, z = 0, y = 0, half = 0;
				System.out.println("\nWelcome to my menu. Please select from the following options:\n\n"
				+ "\t 1. Multiplication Table\n"
				+ "\t 2. Design Two\n"
				+ "\t 3. Design Three\n"
				+ "\t 4. Design Four\n"
				+ "\t 5. Design Five\n"
				+ "\t 6. Challenging Problem\n"
				+ "\t 7. Exit\n");
				
			choice = reader.readInt("Enter your selection (1-7): ");
			
			if (choice == 1)
			{	
				for(x = 1; x <= 8; x++)
				{
						System.out.print("\t" + x);
				}
				for(x=1; x<=8; x++)
				{
					System.out.print("\n" + x);
					for(j = 1; j <= 8; j++)
						System.out.print("\t" + x*j);
				}
			}
			
			else if(choice == 2 || choice == 3 || choice == 4 || choice == 5)
			{
				char initial = reader.readChar("What's your initial???  ");
				
				if (choice == 2)
				{
					for(x = 1; x <= 5 ; x++)
					{
						for(j = 1; j <= 5; j++)
						{
							System.out.print(initial);
							
						}
						System.out.println();
					}
					
				}
				else if(choice == 3)
				{
					for (j = 5; j >= 1; j--)
					{
						for(x = j; x >= 1; x--)
							System.out.print(initial);
						System.out.println();
							
					}
				}
				else if(choice == 4)
				{
					for(j = 1; j <= 5; j++)								
					{
						for(x = j; x >= 1; x--)	// print spaces in a triangle starting with one on the top						
							System.out.print(" ");
						for(z = j; z <=5 ;z++ ) // print initials in same way as choice 3, but pushed by spaces
							System.out.print(initial);
						
						System.out.println();
					}
				}
				else if(choice == 5)
				{
					for(x = 1; x<=5; x++)
					{
						for(j = x; j <= 5; j++)// making spaces
							System.out.print(" ");
						for(z = x; z >= 1; z--)
							System.out.print(initial);//makes initial staircase
						for(y = x-1; y >= 1; y--)
							System.out.print(initial);//makes second, decending staircase
						System.out.println();
					
					}
				}
				
			}
				else if(choice == 6)
				{
					int size = 4;
					
					do
					{
						size = reader.readInt("Enter an Odd Diamond Size: ");
						if(size%2==0)
						{
							System.out.println("Invalid Entry");
							continue;
						}
						else
							break;
						
					}while(size%2==0);
					
					half = size/2+1;
						
					
					for(x = 1; x<=half; x++)
					{
						for(j = x; j <= half; j++)// making spaces
							System.out.print(" ");
						for(z = x; z >= 1; z--)
							System.out.print("*");//makes initial staircase
						for(y = x-1; y >= 1; y--)
							System.out.print("*");//makes second, decending staircase
						System.out.println();
					
					}
					for(x = 1; x <= half - 1; x++)
					{
						for(j = x+1; j >= 1; j--)	// print spaces in a triangle starting with one on the top						
							System.out.print(" ");
						for(z = x; z <= half-1 ;z++) // print initials in same way as choice 3, but pushed by spaces
							System.out.print("*");
						for(y = x+2; y <= half; y++)
							System.out.print("*");
						System.out.println();
						
					}
					
					
					
					
					
					
					/*for(x = 1; x <= size; x++)
						{
							for(j = x; j <= ((size-1)/2)+(size/2+1); j++)
								System.out.print(" ");
							for(z = x; z >= (size-(size-1)/2); z--)
								System.out.print("*");
							for(y = x-1; y >= (size-(size-1)/2); y--)
								System.out.print("*");
						System.out.println();		
						
						}
					for(x = 1; x <= size - 1; x++)
					{
						for(j = x-1; j >= 1; j--)	// print spaces in a triangle starting with one on the top						
							System.out.print(" ");
						for(z = x-1; z <= size-1 ;z++) // print initials in same way as choice 3, but pushed by spaces
							System.out.print("*");
					}
					*/
					
				
			}
			
		}while(choice != 7);
		System.out.println("Goodbye!!!");
		
	}
}