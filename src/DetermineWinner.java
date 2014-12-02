public class DetermineWinner extends UserChoice
{
	// 3 Move objects: Rock, Paper, Scissors
	// Initialize variables;
	public int winCount;
	public int loseCount;
	public int drawCount;
	
	// Constructor with (variables/fields) to pass values
	public DetermineWinner() 
	{
		super();
	} // end constructor Welcome

	// The determineWinner method returns the output based on parameters
	public String determineWinner (String computerChoice, String userChoice) 
	{
		//checkNotNull(computerChoice, "computer must have a choice");
		//checkNotNull(userChoice, "user must have a choice");
    
		String output;
    
		output = "\nThe computer's roll is " + computerChoice + ".";
		output += "\nThe user's guess is " + userChoice + ".\n";

		// check logic
		// If user plays HI
		if (userChoice.equalsIgnoreCase("HI")) 
		{
			// If user plays rock vs cpu plays scissors
			if (computerChoice.equalsIgnoreCase("LO"))
			{
				output += "You guessed too high! You Lose!\n";
				loseCount++;
			}
			// If user plays rock vs cpu plays paper
			else if (computerChoice.equalsIgnoreCase("HI"))
			{
				output += "You guessed high correctly! You Win!\n";
				winCount++;
			}
			// If user plays rock vs cpu plays rock
			else
			{
				output += "The game is tied!\nPlay again...\n";
				drawCount++;
			}
		} // end if user plays rock
		
		// If user plays LO
		else if (userChoice.equalsIgnoreCase("LO")) 
		{
			// If user plays paper vs cpu plays scissors
			if (computerChoice.equalsIgnoreCase("HI"))
			{
				output += "You guessed too low! You Lose!\n";
				loseCount++;
			}
			// If user plays paper vs cpu plays rock
			else if (computerChoice.equalsIgnoreCase("LO"))
			{
				output += "You guessed low correctly! You Win!\n";
				winCount++;
			}
			// If user plays paper vs cpu plays paper
			else
			{
				output += "The game is tied!\nPlay again...\n";
				drawCount++;
			}
		} // end if user plays paper
    
		return output;
	}

} // end class DetermineWinner