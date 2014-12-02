import java.util.Scanner;

public class mainCode
{
	public static void main(String[] args) 
	{
		int rollCount = 0;
		int dNum = 0;
	    String computer = null;
	    String user = null;
		String play = null;
		String output = null;
		Scanner scan = new Scanner(System.in);
		
    	// Play the game as long as there is a tie.
		UserChoice uChoice = new UserChoice();
		OneDice oneD = new OneDice(dNum);
		TwoDice twoD = new TwoDice(dNum);
		ThreeDice threeD = new ThreeDice(dNum);
    	// Create a new object called winner
    	DetermineWinner winner = new DetermineWinner();
    		   		
    	do
    	{	
    			do 
    			{
    				System.out.print("\nHow many Dice do you want to play with?" +
    						"\n1 = One Dice 2 = Two Dice 3 = Three Dice ");
    						dNum = scan.nextInt();
    						System.out.println("\nPlayer selected " + dNum + " Dices to play with: ");
    						    						
    		    			if (dNum < 1 || dNum > 3)
    		    			{
    		    		    	System.out.println("This is an Invalid Selection. Please Try Again.");
    		    			}								
    							if (dNum == 1)
    							{
    								computer = oneD.getThrow(dNum);
    								user = uChoice.userChoice();
    								output = winner.determineWinner(computer, user);
    								System.out.println(output);
    								rollCount++;
    							} // end If
    									else if (dNum == 2)
    									{
    										System.out.println("All Dice thrown are: " +
        													twoD.getThrow(dNum));
    										rollCount++;
    									} // end 1st Else If
    										else if (dNum == 3)
    										{
    											System.out.println("All Dice thrown are: " +
        															threeD.getThrow(dNum));
    											rollCount++;
    										} // end 2nd Else If
    			}
    			//while (dNum >=1 & dNum <=3);
    			while (user.equalsIgnoreCase(computer));
    			// Exit inside Do-While Loop

    			System.out.print("\nDo you want to play again? Yes or No ");
    			play = scan.next();
    	}
    	while(play.equalsIgnoreCase("YES"));
    	// Exit outside Do-While Loop
    	
		System.out.println( "Total Score: " +
							"\nWins = " + winner.winCount +
							"\nLoss = " + winner.loseCount +
							"\nDraws = " + winner.drawCount );
    	System.out.println("\nDice was Thrown a Total of " + rollCount + " times." + 
    						"\nGame Over. Thank you for playing!" +
    						"\nPlay Again Later. Good-Bye!");
    	
		scan.close();

		
	} // end static void main
} // end class mainCode