import java.util.Scanner;

public class UserChoice extends Translation
{
	// 3 Move objects: Rock, Paper, Scissors
	// Initialize variables;
	String play = null;
	int dNum = 0;
	int userChoice = 0;
	Translation trans = new Translation();
	Scanner scan = new Scanner(System.in);
	
	// Constructor with (variables/fields) to pass values
	public UserChoice() 
	{
		super();
		// Ask the user for input
		System.out.print("Welcome to the Hi-Lo Game!\nGuess: 6 = HI or 1 = LO: " );

		// Assign the user's input 1, 2, or 3 as integer value to userChoice variable
		userChoice = scan.nextInt();
		
		play = trans.getChoice(userChoice);
	} // end constructor Welcome

	// Hi:  More than half of dice(s) value  (1 dice this means 4,5,6  .... 2 dices means 7 to 12....)
	// Lo:  Less than or equal to half of dice(s) value (1 dice this means 1,2,3  .... 2 dices means 1 to 6....)
	
	// Method should return the user's choice.
	public String userChoice() 
	{		
		// Return the user's choice as a string value, assign to play variable
		return play;
	}
	
} // end class UserChoice