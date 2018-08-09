// Kenia Hale
// Hale_birthDay
// birthday!!



public class Hale_birthDay
{
	public static void main(String [] args)
	{
		KeyboardReader reader = new KeyboardReader();
		
		int day, month, year, total = 0, remainder = 0;
		
		month = reader.readInt("What month were you born? (please enter number): ");
		day = reader.readInt("What day were you born? (please enter number): ");
		year = reader.readInt("What year were you born? (please enter last two digits): ");
		
		total = year/4;      //99/4 = 24
		total = total + year;//24 + 99 = 123
		total = total + day;//153
		
		switch(month)
		{
			case 1:
				total += 1;
				break;
			case 2:
				total += 4;
				break;
			case 3:
				total += 4;
				break;
			case 4:
				total += 0;
				break;
			case 5:
				total += 2;
				break;
			case 6:
				total += 5;
				break;
			case 7:
				total += 0;
				break;
			case 8:
				total += 3;
				break;
			case 9:
				total += 6;
				break;
			case 10:
				total += 1;
				break;
			case 11:
				total += 4;
				break;
			case 12:
				total += 6;
				break; 
					
		}
		
		if (year%4 == 0)
		{
			if (month == 1 || month == 2)
				total--;
		}
		
		remainder = total%7; //
		
		switch(remainder)
		{
		
			case 1:
				System.out.println("You were born on a Sunday!");
				break;
			case 2:
				System.out.println("You were born on a Monday!");
				break;
			case 3:
				System.out.println("You were born on a Tuesday!");
				break;
			case 4:
				System.out.println("You were born on a Wednesday!");
				break;
			case 5:
				System.out.println("You were born on a Thursday!");
				break;
			case 6:
				System.out.println("You were born on a Friday!");
				break;
			case 0:
				System.out.println("You were born on a Saturday!");
				break;
		}		
		
	}
	
}
		
		