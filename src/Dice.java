
public class Dice {
	private final static int NUMOFDICE = 5;
	private final static int SIDESOFDIE = 6;
	private static int[] DieValues = new int[NUMOFDICE];
	static private Die[] Dies = new Die[NUMOFDICE];
	
	public Dice(){
		for(int x = 0; x < Dies.length ; x++){
			Dies[x] = new Die(SIDESOFDIE);
		}
	}
	public void rollDice(){
		for(int roll = 0; roll < Dies.length; roll++){
			DieValues[roll] = Dies[roll].roll();
		}
		for(int i=0;i<NUMOFDICE;i++){
			System.out.println("Dice roll " + (i+1) + " was: " + DieValues[i]);
		}
	}
	
}