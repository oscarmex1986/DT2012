// A program that throws two dice and one wins
// if both dice are the same number
// E.g., 2 and 2 are a win
// 1 and 5 are a lose
// Count the attempts it took you to get your
// first win

public class ThrowTwoDice{

	public static void main(String[] args){
		// Initialize a counter for attempts
		int attempts = 0;
		// Detect whether I have already won
		boolean haveIWonAlready = false;

		while(haveIWonAlready == false){
			// First, I create two Random Numbers 
			// For that, I know how to use Math.random()
			int die1 = (int)(Math.random()*6) + 1; //1 to 6
			int die2 = (int)(Math.random()*6) + 1;


			System.out.println("Die 1 is " + die1);
			System.out.println("Die 2 is " + die2);

			if(die1 == die2){
				System.out.println("You win!");
				haveIWonAlready = true;
				attempts++;
			} else {
				System.out.println("You lose!");
				attempts = attempts + 1;
			}
		}

		System.out.println("It took you " + attempts + " attempts.");

		
	}
	
}