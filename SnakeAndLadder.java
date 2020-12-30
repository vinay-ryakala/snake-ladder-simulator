import java.util.ArrayList;

public class Sanke 
{
	 public static final int  INTIAL_POSITION=0;
	   public static final int FINAL_POSITION=100;
	   public static final int LADDER=1;
	   public static final int SNAKE=2;
	   public static final int NO_PLAY=3;
	   
	
	   static int diceRoll () {
		  int die=(int) ((Math.random() * 6 ) + 1 );
		  return die;
	   }

	   static int optionCheck( int dieRoll,int position )
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
	            int dieRoll1=diceRoll();
	            if(position+dieRoll>100)
	                position=position;
	            else
	                position+=dieRoll;
	                if(position+dieRoll1>100)
	                    position=position;
	                else
	                    position+=dieRoll1;
	                
	               
	            break;
	      }
	      if(position<0)
	      position=0;
	      return position;
	   }
	   
	   public static void game ()
	   {	
		  int position=0;	
		  int positionA = 0;
		  int count=0;
		  int positionB = 0;
		  ArrayList<Integer> posA=new ArrayList<>();
		  ArrayList<Integer> posB=new ArrayList<>();
		  while (position<100)
		  {
		    int dieRollA = diceRoll();
		    int dieRollB = diceRoll();
		    positionA=optionCheck(dieRollA,positionA);
		    positionB=optionCheck(dieRollB,positionB);
		    posB.add(positionB); 
		    posA.add(positionA);
		    if (positionA>positionB)
		        position=positionA;
		    else
		    	position=positionB;
		       count++;
		    }
		  if (positionA>positionB)
		    System.out.println("Player A is winner");
		  else
		    System.out.println("Player B is winner");
		  System.out.println("position of A:"+positionA+" position of B:"+positionB);
		  System.out.println("number of times each player rolled die rolled:"+count);
		  System.out.println("position of A after every roll:"+posA);
	       System.out.println("position of B after every roll:"+posB);
	   }
	   public static void main(String[] args)
	   {
	       System.out.println("Welcome to Snake and Ladder Simulation");
		   game();
	      
	   }
	
}
