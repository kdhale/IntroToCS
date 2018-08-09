// Kenia Hale
// Hale_ifLetterGrade
// grade???

import java.util.Scanner;

public class Hale_ifLetterGrade
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int grade;
		
		System.out.print("Please enter your percent in the class: ");
		grade = reader.nextInt();
		
		if (grade <= 100 && grade >= 90)
		{
			System.out.println("Your grade in the class is an A");
		}
		else if (grade < 90 && grade >= 80)
		{
			System.out.println("Your grade in the class is an B");
		}
		else if (grade < 80 && grade >=70)
		{
			System.out.println("Your grade in the class is an C");
		}	
		else if (grade < 70 && grade >=60)
		{
			System.out.println("Your grade in the class is an D");
		}
		else if (grade < 60)	
		{
			System.out.println("Your grade in the class is an F");
		}
			
	}
	
}