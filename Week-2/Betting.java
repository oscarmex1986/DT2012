public class Betting{
	public static void main(String[] args){
		// I will simulate the n matchdays
		// Odd matchdays are home games
		// Even matchdays are away games
		int n = Integer.parseInt(args[0]);
		
		// Read the wagers, args[1] for home and args[2] for away
		double hw = Double.parseDouble(args[1]);
		double aw = Double.parseDouble(args[2]);
		double balance = 0;

		// Count home and away wins
		int homeWins = 0;
		int awayWins = 0;
		// Count home and away ties
		int homeTies = 0;
		int awayTies = 0;
		// Count home and away loses
		int homeLoses = 0;
		int awayLoses = 0;

		// i does not exist out here
		for(int i = 1; i <= n; i++){
			// i exists here
			// if a number is divisible exactly by 2, it is even
			// the modulo operator (%) tells me the remainder of a division
			// if the remainder is zero, the number is exactly divisible
			// So, if i % 2 is equal to zero, it is an even number
			double odds = Math.random();
			if( i % 2 == 0){
				// i exists here
				System.out.println("Matchday " + i + " is away.");
				if (odds < 0.3){
					// Team won the match
					System.out.println("Win");
					awayWins++;
					balance = balance + aw;
				} else {
					// Team lost or tied
					balance = balance - aw;
					if(odds < 0.6){
						// Team tied
						System.out.println("Tie");
						awayTies++;
					} else {
						// Team lost
						System.out.println("Lose");
						awayLoses++;
					}
					
				}
			} else {
				// i exists here
				// Game is home, there is 66% chance of winning
				System.out.println("Matchday " + i + " is home.");
				if (odds < 0.66){
					// Team won the match
					System.out.println("Win");
					homeWins++;
					balance = balance + hw;
				} else {
					// Team lost or tied
					balance = balance - hw;
					if(odds < 0.9){
						// Team tied
						System.out.println("Tie");
						homeTies++;
					} else {
						// Team lost
						System.out.println("Lose");
						homeLoses++;
					}
					
				}
			}
		}
		// i has ceased to exist
		// Print the aggregated stats
		System.out.println("Home -- " + homeWins + " wins, " + homeTies + " ties, and " + homeLoses + " loses.");
		System.out.println("Away -- " + awayWins + " wins, " + awayTies + " ties, and " + awayLoses + " loses.");
		System.out.println("Balance: " + balance + " kr");
	}
}