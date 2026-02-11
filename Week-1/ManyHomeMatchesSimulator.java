public class ManyHomeMatchesSimulator{
	public static void main(String[] args){
		// I read from the command line how many matches I shall simulate
		int numberOfMatches = Integer.parseInt(args[0]);
		int countWin = 0;
		int countOTWin = 0;
		int countLoss = 0;
		int countOTLoss = 0;
		for(int i = 0; i < numberOfMatches; i++){
			// I generate a number
			double res = Math.random();
			if(res <= 0.7692){
				// Win 
				countWin++;
			} else if(res <= 0.841){
				// Win in overtime
				countOTWin++;
			} else if(res <= 0.9614){
				// Loss
				countLoss++;
			} else {
				// Loss in overtime
				countOTLoss++;
			}	
		}
		
		// Print aggregate numbers
		System.out.println("We have simulated " + numberOfMatches + " matches");
		System.out.println("Wins: " + countWin);
		System.out.println("Wins in OT: " + countOTWin);
		System.out.println("Losses: " + countLoss);
		System.out.println("Losses in OT: " + countOTLoss);

	}
}