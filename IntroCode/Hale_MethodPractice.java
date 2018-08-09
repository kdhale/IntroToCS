/*Halr_MethodPractice.java
 *put your name here
* practice with methods*/
   
public class Hale_MethodPractice
{ 
	//Main method
	public static void main(String[] fiasco)
	{
		KeyboardReader reader = new KeyboardReader();
		
		int choice;
		
		do{
			System.out.println("\n\n");
			System.out.println("Welcome to the method menu. Please select from the following options:");
			System.out.println("\n\t1. Print 30 Stars");
			System.out.println("\t2. Print XX Stars");
			System.out.println("\t3. Print XX of whatever you like");
			System.out.println("\t4. Area of a Triangle");
			System.out.println("\t5. Perimeter of Rectangle");
			System.out.println("\t6. To The Power");
			System.out.println("\t7. Is It Prime?");
			System.out.println("\t8. Square Rooooot!!");
			System.out.println("\t9. NIM!!!!!! nvm don't look at this it's not finished!");
			System.out.println("\t99. Exit");
			choice = reader.readInt("\nEnter your selection !!!:\t");
			System.out.println("\n");
			
			if (choice == 1)
			{
				drawStars();

			}
			else if (choice == 2)
			{
				int num1 = reader.readInt("How many stars do you want?:\t");
				drawStars(num1);// add method call here

			}
			else if (choice == 3)
			{
				char symbol = reader.readChar("What symbol would you like?:\t");
				int num2 = reader.readInt("How many would you like to see?:\t");
				// add method call here
				draw_what(symbol,num2);

			}		
			else if (choice == 4)
			{
				int num1 = reader.readInt("Enter the base of the triangle:\t\t");
				int num2 = reader.readInt("Enter the height of the triangle:\t");
				// add method call here
				
				double answer = area(num1, num2);
				System.out.println("The area of the triangle is " + answer);
			}	
			else if(choice == 5)
			{
				int width = reader.readInt("Enter the width:\t\t");
				int length = reader.readInt("Enter the length:\t\t");
				
				int perimeter = rectPerimeter(length,width);
				System.out.println("The perimeter is " + perimeter);
			}	
			else if(choice == 6)
			{
				int base = reader.readInt("What's the base?\t\t");
				int power = reader.readInt("What's the power?\t\t");
				
				int answer = toThePower(base,power);
				System.out.println(base + " to the power of " + power + " equals " + answer);
			}
			else if(choice == 7)
			{
				int num = reader.readInt("What's the number?\t\t");
						
				boolean prime = isPrime(num);
				if(prime == true)
					System.out.println(num + " is a prime number.");
				else
					System.out.println(num + " is NOT a prime number.");
			}
			else if(choice == 8)
			{
				double num = reader.readDouble("What's the number?\t\t");
						
				double sqrt = sqRT(num);
				System.out.printf("The square root of %.0f is %,.4f\n", num, sqrt);// %,.2f\n", gasPrice
				
			}
			else if(choice == 9)
			{
				boolean winner = playNim();
				if(playNim == true)
					System.out.println("You won!!!");
				else
					System.out.println("You lost!!!");
			
				
					
			}
			else if (choice == 99)
			{
				System.out.println("\n\nGoodbye!\n\n");
				break;   //this terminates the loop
				
			}		
			else
			{
					System.out.println("Enter a valid number, you doofus.");
			}

			reader.pause();
		}while(true);  //The only way out of the loop is if choice == 99
		
	} //ends the main method
	


	//*************************************************************************
	// All of the method definitions are down here:

	//NIM
	public static boolean playNim()
	{
		int initialSize = (int)(100*Math.random())+10;
		int compFirst = (int)(Math.random());
		
		if(compFirst == 1)// if 1, then computer goes first
		{
			System.out.println("The computer goes first.");
			int compSmart = (int)(Math.random());
			if(compSmart == 1)//if 1, then computer plays smart
			{
				System.out.println("The computer will play smart.");
				int compTake = initialSize/2;
			}
			else//computer plays dumb
			{
				
			}
		}
		else// person goes first
		{
			int compSmart = (int)(Math.random());
			if(compSmart == 1)//if 1, then computer plays smart
			{
				
			}
			else//computer plays dumb
			{
				
			}
		}
	
		
	}
	
	//find square root
	public static double sqRT(double num)
	{
		double i = 0;
		while(i*i<num)
		{
			i = i + .0001;
		}
		return i;
		
		
	}	
	// find prime or not
	public static boolean isPrime(int num)//MOST BEAUTIFUL THING EVER i concur
	{
		int i = 1, j = 0;// i counter is for testing numbers, j counts how many numbers it can be evenly divisible by
		
		while(i <= num)
		{
			if(num % i == 0)
				j++;// adds one every time finds a number to be divided by
			i++;// keeps counting up
		}
		if(j>=3)// if able to be evenly divided by more than 2 numbers, then can't be prime!!!!
			return false;
		else
			return true;
	}	
	
	
	//base to the power of a number
	public static int toThePower(int base, int power)
	{
		int answer = 1, i;
		for(i = 1; i <= power; i++)
			answer = answer * base;
		return answer;
	}	
	
	//perimeter of rectangle
	public static int rectPerimeter(int length, int width)
	{
		return 2*length + 2*width;
	}	
	//reture area of triangle
	public static double area(int base, int kenia)
	{
		return (double)1/2*base*kenia;
	}	
	//Displays variable stars
	public static void draw_what(char frootloops, int many)
	{
		for(int i = 1; i<=many; i++)
			System.out.print(frootloops);
		System.out.println();
	}	
	//This method will display 30 stars
	public static void drawStars()
	{
		for(int i = 1; i <= 30; i++)
			System.out.print("*");
		System.out.println();
	}
	// This method will display a variable number stars
	public static void drawStars(int num1)
	{
		for(int i = 1; i<=num1; i++)
			System.out.print("*");
		System.out.println();
	}
	// 
		
}  //ends the methodPractice class