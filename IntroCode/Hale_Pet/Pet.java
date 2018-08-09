// McKeen
// Pet
// The Pet Class

public class Pet
{
	// Characteristics (Variables)
	public int weight;		//weight of pet, start at 
	public final int INIWEIGHT;// ogiginal weight of pet, displays every time talk about weight, start at 25
	public String nickname;  // stores the acrobat's nickname	
	public int strength; // Scale from 0 to 30, 0 is sickly
	public String mood; //string, displays specific mood 0 to 20, 0 = feel really bad
	public int moodCount;// increase or desrease everytime do something
	public int knowCount; //like mood count
	public int tired;// if above 20, dies
	public int bdo;
	
	// Default Constructor Method -- to be entered here
	public Pet()
	{
		INIWEIGHT = 50;
		weight = 50;
		nickname = "cutie pie";
		strength =  15;
		mood = "normal";
		moodCount = 15;
		knowCount = 15;
		tired = 15;
		
	}
	// Behaviors (Methods)
	//college
	public void college(String co, int chance)
	{
		if(chance == 1)
		{
			if(knowCount < 15)
			{
				System.out.println("Sorry, " + nickname + " wasn't accepted... maybe try more extracurriculars?");
				moodCount-=5;
			}
			else
			{
				System.out.println("Omg! " + nickname + " was accepted! Congrats!");
				moodCount+=5;
			}	
		}
		else
		{
			int ran = (int)(9*Math.random());
			if(ran == 7)
			{
				System.out.println("Omg! " + nickname + " was accepted! Congrats!");
				moodCount+=5;
			}
			else
			{
				System.out.println("Sorry, " + nickname + " wasn't accepted... maybe try more extracurriculars?");
				moodCount-=5;
			}
		}
		
	}
	// lazy
	public void lazy(int numTimes)
	{
		for(int i = 1; i <= numTimes; i++)
			{
				System.out.println("zzz");
				tired--;
			
			}	
	}
	
	// try flapping
	
	public void tryFlap()
	{
		if(knowCount<= 10)
		{
			moodCount-=5;
			System.out.println(nickname + " doesn't know what flapping is! This make the birdito sad. try doing something to increase " + nickname + "'s knowledge?");
		}
		else if(knowCount <= 20)
		{
			moodCount++;
			strength++;
			System.out.println("Hey! " + nickname + " trys flapping its wings, and makes it a bit off the ground ! nice!");
			
		}
		else
		{
			moodCount+=5;
			strength+=2;
			System.out.println(nickname + " is flying high ! wowza!");
			
		}		
	}
	// Adds to the pet's weight as it eats
	public void eat(int food)
	{
		int pounds = food*3;
		weight = weight + pounds;
		strength++;
		System.out.println(nickname +" ate.  It began at " + INIWEIGHT + " and now weighs " + weight + " pounds!");
		if(weight == 0)
			System.out.println(nickname + " died. you didn't feed them enough!");
		else if (weight <= 25)
			System.out.println(nickname + " is pretty sickly! You should feed them.");
		else if (weight <= 75)
			System.out.println(nickname + " is at a healthy weight ! Nice!");
		else if (weight < 100)
			System.out.println(nickname + " is getting pretty chubby, maybe you should go for a run...");
		else
			System.out.println(nickname + " died. you fed them too much!");		
	}
	
	// Shows all of the pet's characteristics
	public void displayInfo()
	{
		System.out.println("Nickname:\t" + nickname + "\n"
						+ "Weight:\t\t" + weight + "\n"
						+ "Initial Weight:\t" + INIWEIGHT + "\n"
						+ "Strength:\t" + strength + "/30\n"
						+ "Mood:\t\t" + mood() + "\n"
						+ "Knowledge:\t" + knowCount + "/30\n"
						+ "Tiredness:\t" + tired + "/30\n");
	}
	// mood
	public String mood()	
	{
		if(moodCount < 0)
			return "crying itself to sleep at night";
		else if (moodCount <= 5)
			return "starting to sniffle";
		else if (moodCount <= 10)
			return "feeling eh";
		else if(moodCount <= 15)
			return "normal";
		else if(moodCount <= 20)
			return "pretty alright!";
		else if(moodCount <= 25)
			return "jumping for a joy!";
		else if(moodCount < 30)
			return "this is one happy birdito!";
		else
			return "idk if this bird burrito can get any happier than this tbh";
				
	}
	// pomnd ex
	public String inspQ()
	{
		int quote = (int)(9*Math.random());
		knowCount++;
		moodCount++;
		if (quote == 0)
			return "\"Marry the right person\"\nMr. McKeen";
		else if (quote == 1)
			return "\"I hate you\"\nShruti Gupta";
		else if(quote == 2)
			return "\"...\"\n my dog Jamison";
		else if (quote == 3)
			return "\"go vegan\"\nTalia Mesnik";
		else if (quote == 4)
			return "\"hi\"\nAlex Winkler";
		else if (quote == 5)
			return "\"i don't have one fromm me, but i have thiis quote in latin that goes"
				+"\"Non est ad astra mollis e terris via\"which means \"There is no easy way from the earth to the stars\""
				+"\nAlex Flauto";
		else if (quote == 6)
			return "\"ahh there was just something in my mind, i was just thinkng... no don't say that! eh, but that's life right\""
				+"\nKelton Hale";
		else if (quote == 7)
			return "\"something\"\n My mom, when asked to say something";
		else if (quote == 8)
			return "\"*singing* say something I'm giving up on you\"\n My sister when asked to say something";
		else
			return "\"eh i'm not good at on the spot stuff, man\"\n Jacob Wenk";		 
	}
	//fight!!!!
	public String fight(String who)
	{
		if(strength < 10)
			return "sorry, " + nickname + " isn't strong enough to fight, perhaps you should do some strengthening activities?";
		else if(tired >=20)
			return nickname + " is too tired to fight, you should let it rest a bit...";
		else 
		{
		
			int fight  = (int)(4*Math.random());
			knowCount++;
			moodCount++;
			if (fight == 0)
			{			
				strength++;
				moodCount++;
				tired++;
				return who + " throws a punch, but " + nickname + " dodges and lunges for " + who +"'s feet! " + nickname + " flips "
					 + who + " over it's shoulder, and throws " + who + " in a nearby volcano! wowza!";
	
			}
			else if (fight== 1)
			{			
				moodCount-=7;
				strength--;
				tired++;
				return nickname + " is suprised, and freezes up completely! " + who + " laughs in " + nickname + "'s face! what a nerd!";
	
			}
			else if (fight == 2)
			{			
				moodCount++;
				knowCount++;
				return nickname + " and " + who + " take their stances, but a suprise rainbow beings and they realize that violence isn't the answer. nice!";
	
			}
				
			else if (fight == 3)
			{			
				moodCount++;
				tired++;
				strength++;
				return nickname + " masters all the elements and joins together with friends to defeat evil fire lord " + who;
	
			}
			else 
			{			
				knowCount++;
				return who + " goes to take a defensive stance, but " + nickname + " refuses to resort to such base methods as fighting.\n"
					+"\"let us work this out like adults\" says " + nickname + ", wearing a crisp new business casual outfit and jorts";
	
			}	
		}
		
		
		
	}

		
	}
	
		
	
	
