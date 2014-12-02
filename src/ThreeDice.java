
public class ThreeDice extends GameEngine
{	
	public ThreeDice( int rNum ) 
	{
		super();
		System.out.println("Dice No.1 = " + d1 +
							"\nDice No.2 = " + d2 +
								"\nDice No.3 = " + d3);
		Throw = d1 + d2 + d3;
	} // end constructor ThreeDice
	

} // end class ThreeDice
