public class IntegerArrays{
	/* 
		This method prints the index and value in an array of integers
	*/
	public static void printAnArrayOfIntegers(int[] theArrayToPrint){
		for (int i = 0; i < theArrayToPrint.length ; i++) {
	      System.out.println(i + " " + theArrayToPrint[i]);
	    }
	}

	/* 
		This method prints the index and value in an array of integers
	*/
	public static void printAnArrayOfIntegers(int[][] theArrayToPrint){
		for (int i = 0; i < theArrayToPrint.length ; i++) {
			System.out.print(i + " " );
			for(int j = 0 ; j < theArrayToPrint[i].length ; j++){
				System.out.print(theArrayToPrint[i][j] + " ");
			}
	      	System.out.println("");
	    }
	}

	/*
		This method fills up and returns an array of the specified size
	*/
	public static int[] filledUpArray(int numberOfElements){
		int[] aNewArrayThatIsFull = new int[numberOfElements];
		for (int i = 0; i < numberOfElements ; i++){
			aNewArrayThatIsFull[i] = i;
		}

		return aNewArrayThatIsFull;
	}

	/*
		This method fills up and returns an array of the specified size
	*/
	public static int[][] filledUpArray(int numberOfElements,int numberOfColumns){
		int[][] aNewArrayThatIsFull = new int[numberOfElements][numberOfColumns];
		for (int j = 0; j < numberOfColumns ; j++){
			for (int i = 0; i < numberOfElements ; i++){
				aNewArrayThatIsFull[i][j] = i;
			}
		}

		return aNewArrayThatIsFull;
	}

	/*
		This method shuffles the values in a provided array of integers
	*/
	public static int[] shuffleAnArrayOfIntegers(int[] theArrayToShuffle){
		for (int i = 0; i < theArrayToShuffle.length; i++) {
	      int r = (int) (Math.random() * (i+1));     // int between 0 and i
	      int swap = theArrayToShuffle[r];
	      theArrayToShuffle[r] = theArrayToShuffle[i];
	      theArrayToShuffle[i] = swap;
	    }

	    return theArrayToShuffle;
	}

	/*
		This method shuffles the values in a provided array of integers k. times
	*/
	public static int[][] shuffleAnArrayOfIntegers(int[][] theArrayToShuffle){
		for (int i = 0; i < theArrayToShuffle.length; i++) {
			for(int j = 0; j < theArrayToShuffle[i].length; j++){
				int r = (int) (Math.random() * (i+1));     // int between 0 and i
	      		int swap = theArrayToShuffle[r][j];
	      		theArrayToShuffle[r][j] = theArrayToShuffle[i][j];
	      		theArrayToShuffle[i][j] = swap;
			}
	    }

	    return theArrayToShuffle;
	}

	/*
		This method counts the elements in place in a provided array of integers
	*/

	public static int countElementsInPlace(int[] theShuffledArray){
		int inPlace = 0;
	    for (int i = 0; i < theShuffledArray.length ; i++) {
	      if(i == theShuffledArray[i]){
	        inPlace++;
	      }
	    }

	    return inPlace;
	}
}
