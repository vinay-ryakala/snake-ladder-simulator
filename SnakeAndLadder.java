public class SnakeandLadder
{
	//constants
	public static final int  INTIAL_POSITION=0;
	public static final int FINAL_POSITION=100;
   public static final int LADDER=1;
   public static final int SNAKE=2;
   public static final int NO_PLAY=3;

	static int  optionCheck( int dieRoll,int position )
	{
		int option = (int) ((Math.random() *3) + 1);
		switch ( option )
		{
			case NO_PLAY:
				position=position;
				break;
			case SNAKE:
				position -= dieRoll;
				break;
			case LADDER:
				position += dieRoll;
				break;
		}
	return position;
	}

	public static void main(String[] args)
	{
		int numberOfPlayers = 1;
		int position = 0;
		System.out.println("Welcome to Snake and Ladder Simulation");
		int dieRoll = (int) ((Math.random() * 6 ) + 1 );
		position=optionCheck(dieRoll,position);
		System.out.println("Number got by rolling a die: "+dieRoll+" position: "+position);
		
	}
}
