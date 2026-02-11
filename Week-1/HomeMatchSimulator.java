public class HomeMatchSimulator{
	public static void main(String[] args){
		// I generate a number
		double res = Math.random();
		if(res <= 0.7692){
			// Win 
			System.out.println("Win");
		} else if(res <= 0.841){
			// Win in overtime
			System.out.println("Win in overtime");
		} else if(res <= 0.9614){
			// Loss
			System.out.println("Loss");
		} else {
			// Loss in overtime
			System.out.println("Loss in overtime");
		}
	}
}