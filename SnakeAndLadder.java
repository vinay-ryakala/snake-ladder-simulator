public class SnakeandLadder
{
	public static void main(String[] args)
	{
		int INTIAL_POSITION = 0;
		int NUMBER_OF_PLAYER = 1;
		System.out.println("Welcome to Snake and Ladder Simulation");
		int dieRoll = (int) ((Math.random() * 6 ) + 1 );
		System.out.println("Number got by rolling a die: "+dieRoll);
	}
}
