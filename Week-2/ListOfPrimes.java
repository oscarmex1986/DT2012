public class ListOfPrimes{
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);

		boolean prime = true;

		if(n > 0 && n > 2){
			// This is where we put our for loop
			System.out.println(1);
			System.out.println(2);
			for(int i = 3; i <= n; i++){
				for(int k = 2; k < i ; k++){
					if(i % k == 0) prime = false;
				}
				if (prime) System.out.println(i);
				prime = true;
			}
		} else if(n >  0 && n <= 2){
			for(int j = 1; j<=n; j++){
				System.out.println(j);
			}

		}
	}
}
