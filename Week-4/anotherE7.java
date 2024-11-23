public class anotherE7{
	
	public static int[] filledUpArray(int numberOfElements){
		int[] aNewArrayThatIsFull = new int[numberOfElements];
		for (int i = 0; i < numberOfElements ; i++){
			aNewArrayThatIsFull[i] = i;
		}

		return aNewArrayThatIsFull;
	}

	public static int[] shuffleAnArrayOfIntegers(int[] theArrayToShuffle){
		for (int i = 0; i < theArrayToShuffle.length; i++) {
	      int r = (int) (Math.random() * (i+1));     // int between 0 and i
	      int swap = theArrayToShuffle[r];
	      theArrayToShuffle[r] = theArrayToShuffle[i];
	      theArrayToShuffle[i] = swap;
	    }

	    return theArrayToShuffle;
	}

	public static int countElementsInPlace(int[] theShuffledArray){
		int inPlace = 0;
	    for (int i = 0; i < theShuffledArray.length ; i++) {
	      if(i == theShuffledArray[i]){
	        inPlace++;
	      }
	    }

	    return inPlace;
	}

	public static void printAnArrayOfIntegers(int[] theArrayToPrint){
		for (int i = 0; i < theArrayToPrint.length ; i++) {
	      System.out.println(i + " " + theArrayToPrint[i]);
	    }
	}

	public static void main(String[] args){
		
		// First, I get the number of elements in the array of which
		// I want to obtain a permutation
		int n = Integer.parseInt(args[0]);

		// Now, I create and fill-up an array of size n
		int[] permutation = new int[n];

		permutation = filledUpArray(n);

		// After this, I have an array with numbers 0, 1, 2, ... , n-1 at 
		// indexes 0, 1, 2, ..., n-1

		// Now, I shuffle the elements
		permutation = shuffleAnArrayOfIntegers(permutation);

		// Now, I count the elements in place in the shuffled array
		int count = countElementsInPlace(permutation);

		// Finally, I print the array
		printAnArrayOfIntegers(permutation);
		// And I print how many elements are in place
		System.out.println(count + " elements are in place");

	}
}
