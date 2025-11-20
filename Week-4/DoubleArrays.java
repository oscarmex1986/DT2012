public class DoubleArrays{
	// This class will contain methods that process arrays of doubles
	public static double minValue(double[] a){
		// The variable a exists here and does not need to be declared
		// a is an array of doubles

		// To find the minimum value in an array of doubles
		// we go through every value and compare it against
		// the minimum and replace it
		double min = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i] < min) min = a[i];
		}

		return min;
	}

	public static double maxValue(double[] a){

		double max = a[0];
		for(int i = 1; i < a.length; i++){
			if(a[i] > max) max = a[i];
		}

		return max;
	}

	public static double sumOfAnArray(double[] theArrayToSum){
		double sum = 0.0;
		for(int i=0 ; i < theArrayToSum.length ; i++){
			sum += theArrayToSum[i];
		}

		return sum;
	}

	public static double averageOfAnArray(double[] theArrayToAverage){
		// The average is the sum of the values divided by the number of values
		return sumOfAnArray(theArrayToAverage)/theArrayToAverage.length;
	}

	public static void printThisArray(double[] theArrayToPrint){
		for(int whateverNameIWant = 0 ; whateverNameIWant < theArrayToPrint.length ; whateverNameIWant++ ){
			System.out.println(theArrayToPrint[whateverNameIWant]);
		}
	}
}