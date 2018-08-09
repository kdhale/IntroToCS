// Kenia Hale
// Hale_OP2UsingPI
// asks radius, output circ, area of circ and  volume and sa sphere

/*Pseudocode
 *
 *Input: double Rad;
 *Output: double A;
		double Circ;
		double Vol;
		double Sa;
 *Constant: final double PI = 3.14159
 *
 *Summary: Read in double Rad, use PI = 3.14159, A = (PI * (Rad * Rad));, Circ = (2 * PI * Rad);, Vol = (PI * (Rad * Rad * Rad) * ((double)4/3));, and
 *  	Sa = (4 * PI * (Rad * Rad)); to display A, Circ, Vol, and Sa
 *
 *
 **/
 
 
import java.util.Scanner;

public class Hale_OP2UsingPI
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		double Rad;
		
		double A;
		double Circ;
		double Vol;
		double Sa;
		
		final double PI = 3.14159;	
		
		System.out.print("Please enter the radius: ");
		Rad = reader.nextDouble();
		
		System.out.println();
		
		System.out.println("A circle with radius " + Rad + " has:");
		
		System.out.println();
		System.out.println();
		
		A = (PI * (Rad * Rad));
		
		System.out.println("Area of          " + A);
		
		Circ = (2 * PI * Rad);
		
		System.out.println("Circumference of " + Circ);
		
		Vol = (PI * (Rad * Rad * Rad) * ((double)4/3));
		
		System.out.println("Volume of        " + Vol);
		
		Sa = (4 * PI * (Rad * Rad));
		
		System.out.println("Surface Area of  " + Sa);
		System.out.println();
		
				
		
		
	}
	
}