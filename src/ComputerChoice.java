
public class ComputerChoice extends GameEngine
{	
	// Constructor with (variables/fields) to pass values
	public ComputerChoice() 
	{
		super();
		if (Throw <= 3)
		{
			Throw = 1;
		}
		else if (Throw >= 4)
		{
			Throw = 6;
		}
	} // end constructor Welcome

	// Hi:  More than half of dice(s) value  (1 dice this means 4,5,6  .... 2 dices means 7 to 12....)
	// Lo:  Less than or equal to half of dice(s) value (1 dice this means 1,2,3  .... 2 dices means 1 to 6....)
	
	// Method should generate a random number and
	// 	return the computers choice.
	public static String computerChoice() 
	{		
		// Return the computer's choice.
		return Translation.getChoice (Throw) ;
	}
	

} // end class ComputerChoice