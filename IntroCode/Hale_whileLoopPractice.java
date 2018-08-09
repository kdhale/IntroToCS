// Kenia Hale
// Hale_whileLoopPractice
// working with switch structures and while loops


public class Hale_whileLoopPractice
{
	public static void main(String [] args)
	{
		KeyboardReader reader = new KeyboardReader();
		
		
		int choice = 1000000000;
		while (choice != 5)
		{
				System.out.println("\nWelcome to my menu. Please select from the following options:\n\n"
				+ "\t 1. Repeating Name\n"
				+ "\t 2. Temp Conversion\n"
				+ "\t 3. Consecutive Integers\n"
				+ "\t 4. Bonus\n"
				+ "\t 5. Exit");
				
			choice = reader.readInt("Enter your selection (1-5): ");
			int i = 0;
		
			switch(choice)
			{
				case 1:
					/*int i = 1;
					while(i <= 15)
					{
						System.out.print(i + " ");
						i++;
					}*/
					String name = reader.readLine("What's your name?\t\t");
					int num = 1;
					while(num!=0)//will exit if enter 0
					{
						System.out.println(name);
						num = reader.readInt("Enter zero to stop the loop, any other number to repeat your name again.\t");	
					}
					break;
				case 2:
					int start = reader.readInt("Enter starting value: ");
					int end = reader.readInt("Enter ending value: ");
					double c = 0;
					System.out.println("\nFahrenheit\tCelsius");
					if(start<=end)// ensure that don't enter a bigger number first
					{
						while(start <= end)
					{
						c = (5/9.0) *(start - 32);
						System.out.printf("%d\t\t%,.2f\n", start,c);
						start++;//do next number
					}
					} 
					else
						System.out.println("Please put a higher value for end, a lower number for start");
					break;
				case 3:
					final int NUMBER = 1000;//may be changed
					int n = 0, sum = 0;
					while(sum < NUMBER)
					{
						n++;
						sum = sum + n;//add next number, till 100
						
					}
					System.out.println("It takes "+ n +" consecutive integers to exceed " + NUMBER + ".\n"
						+"The sum of " + n + " consecutive integers is " + sum + ".");
					break;
				case 4:
					int y = 0;//will hold start to powers
					start = reader.readInt("Please enter a number: ");
					i = 1;
					while(Math.pow(start,i) <= 1000)
					{
						y = (int)(Math.pow(start,i));// y = next number to the next power
						System.out.println(start + "*" + y + " = " + (start*y));// multiply
						i++;
					}
					i -=1 ;//bc will add one during last loop
					
					System.out.println("\nNumber of times:\t" + i);
					if(start > 1000)
					{
						System.out.println("Product:\t\t" + (start));
					}
					else
					System.out.println("Product:\t\t" + (start*y));
					
					break;
				case 5:
					System.out.println("Goodbye.");
					break;
					/*start = reader.readInt("Please enter a number: ");
					while(start%2 == 0)
					{
						start = start/2;
						i++;
					}
					System.out.println( i + " times.");*/
					
				default:
					System.out.println("I know you can do better than this bub.");
			}//ends switch
			
		reader.pause();			
		}//ends while
			
	}//ends main
	
}