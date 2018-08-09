// PetRunner
// McKeen
// A client file that uses the Pet class
 

public class PetRunner
{
	public static void main(String[] args)
	{
		KeyboardReader reader = new KeyboardReader();
		int choice, food, answer;
		Pet p1;
		do 
		{
			answer = reader.readInt("What do you get when you cross a bird and a taco?"
								+ "\n (1). Birdito"
								+ "\n (2). ur mom "
								+ "\n (3). a chicken taco!\n");
			if(answer!=1)
				System.out.println("wrong, try again!");
		}while(answer != 1);
		System.out.println("Nice one! meet your new Birdito! Do you want to name it? or should i? \n 1 = default name, 2 = you choose");
		choice = reader.readInt();
		if (choice == 1)
		{
			p1 = new Pet();
			System.out.println(p1.nickname + " is glad to meet you!!!" );
		}
		else
		{
			p1 = new Pet();
			p1.nickname = reader.readLine("Enter the nickname of your Birdido: ");
			System.out.println(p1.nickname + " is glad to meet you!!!" );

		}
		
		//Looping menu
		do
		{
			choice = reader.readInt(p1.nickname + " is happy to see you ! it's mood is: " + p1.mood() + "\n"
								    +"1.  Give this birdito some eats! \n"
								    +"2.  Want " + p1.nickname + "'s info? \n"
								    +"3.  let " + p1.nickname + " ponder it's existance...\n"
								    +"4.  let " + p1.nickname + " try flapping\n"
								    +"5.  " + p1.nickname + " can just laze around for a bit... \n"
								    +"6.  let " + p1.nickname + " fight someone\n"	
								    +"7.  apply to college\n"
								    +"0.  Exit \n");
								   
			if (choice == 1)//food
			{
				food = reader.readInt("How much would you like to feed the pet?");
				p1.eat(food);
				if (p1.weight == 0 || p1.weight >= 100)
				{
					reader.pause();
					break;	
				}
				reader.pause();
				

			}
			else if (choice == 2)
			{
				p1.displayInfo();
				reader.pause();
			}
			else if (choice == 3)
			{
				System.out.println(p1.nickname + "looks off into the distance and says  \n" + p1.inspQ());
				reader.pause();
			}
			else if (choice == 4)
			{
				p1.tryFlap();
				reader.pause();
			}
			else if(choice == 5)
			{
				int lazy = reader.readInt("How long do you want " + p1.nickname + " to chill?");
				p1.lazy(lazy);
				reader.pause();
			}
			else if(choice == 6)
			{
				String fight = reader.readLine("Who do you want " + p1.nickname + " to fight? ");
				System.out.println(p1.fight(fight));
				reader.pause();
			}
			else if(choice == 7)
			{
				String col = reader.readLine("What college do you want to apply to? ");
				int chance = reader.readInt("Are you confident in your birdito?(1 = yes, 2 = no) ");
				p1.college(col,chance);
				reader.pause();
			}
			
		}while (choice != 0);
		
		
	}
}







		
