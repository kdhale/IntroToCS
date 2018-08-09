// Kenia Hale
// Hale_gradesloop
// working with loops, switches, etc!

/*Psuedocode:
 *	read in: char grade, int total, pass, fail, double perPass, perFail*/
public class Hale_gradesloop
{
	public static void main(String [] args)
	{
		KeyboardReader reader = new KeyboardReader();
		
		int choice = 1000000000;
		while (choice != 5)
		{
				System.out.println("\nWelcome to my menu. Please select from the following options:\n\n"
				+ "\t 1. Class Grades\n"
				+ "\t 2. GCD\n"
				+ "\t 3. GCD Random\n"
				+ "\t 4. Bonus\n"
				+ "\t 5. Exit");
				
			choice = reader.readInt("Enter your selection (1-5): ");
			
			switch(choice)
			{
				case 1:
					char grade = 'A';
					int total = 1, pass = 0, fail = 0;
					
					for(total = 1; total >= 0; total++)
					{
						grade = reader.readChar("Enter grade #" + total + ":\t\t");
						if(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D')
							pass++;//add one more to the pass number
						else if(grade == 'F')
							fail++;//add one more to the fail number
						else if (grade == 'Z' || grade == 'z')
						{
							total--;//bc will add another to total if don't
							break;
						}
						else
						{
							System.out.println("<" + grade + " is NOT an acceptable grade>");
							total--;//to make sure it stays on that number till given correct grade
								
							
						}
							
					}
					
					
					if(total == 0 && grade == 'Z'|| total == 0 && grade == 'z')
					{
						double perPass = 0;//bc if don't, will have NaN
						double perFail = 0; 
						System.out.println(total + " student(s) total");
						System.out.println(pass + " student(s) passed: " + perPass);
						System.out.println(fail + " student(s) fail: " + perFail);
					}
					else
					{
						double perPass = ((double)pass/total)*100;
						double perFail = ((double)fail/total)*100;
						System.out.println(total + " student(s) total");
						System.out.printf("%d student(s) passed: %.2f%%\n",pass,perPass);
						System.out.printf("%d student(s) fail: %.2f%%\n", fail,perFail);
					}
					reader.pause();
					break;
				case 2:
					int num1 = reader.readInt("Enter an integer: \t");
					int num2 = reader.readInt("Enter an integer: \t");
					int i = 0, gcd = 0;
				
					while(i <= num1 || i <= num2)// gcd can't be bigger than the smallest of these numbers
					{
						i++;//keep counting up numbers 
						if(num1%i == 0 && num2%i == 0)
						{
							gcd = i;// so if evenly divisable by both, will set gdc equal to that number
						}
					}
					System.out.println("The GCD is " + gcd);
					reader.pause();
					break;
				case 3:
					num1 = (int)(100*Math.random())+1;//from 1 to 100
					num2 = (int)(100*Math.random())+1;
					i = 0;
					gcd = 0;
				
					while(i <= num1 || i <= num2)
					{
						i++;
						if(num1%i == 0 && num2%i == 0)
						{
							gcd = i;
						}
					}
					System.out.println("Number one is " + num1 +
									"\nNumber two is " + num2 +
									"\nThe GDC is " + gcd);
					reader.pause();
					break;
				case 4:
					int num = reader.readInt("Please enter the number that the program will guess:\t");// won't do anything w this #
					//char hlc = reader.readChar("Is the number 50? (H)igher, (L)ower, (C)orrect ");
					int guessNumb = 0;
					char hlc = 'K';
					int low = 0, high = 100;// between 1 and 100, so set lows and highs equal to that
					while(hlc != 'C')
					{
						
						int guess = low + ((int)high-low)/2;// so will always guess the number half between the low and high
						hlc = reader.readChar("Is the number " + guess + "? (H)igher, (L)ower, (C)orrect:\t\t");
						guessNumb++;
						if(hlc == 'H')
						{
							low = guess;//if higher, will set the guess equal to the low so guess half between low and high
						}
						else if(hlc == 'L')
						{
							high = guess;//if lower, will set the guess equal to the high so guess half between low and high
						}
						
		
					}
					
					System.out.println("It took " + guessNumb + " guesses to reach the number.");
					reader.pause();
					break;
			
			}
		}
		System.out.println("Goodbye!");

	}
}