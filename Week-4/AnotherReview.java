import java.util.Scanner;

public class AnotherReview{
	public static void main(String[] args){
		// I will read a file which indicates how many records it contains
		// and obtain the average of one of the values in the record

		// I will read n personal data points (birthdate, telephone, height)
		// and get the average height

		Scanner data = new Scanner(System.in);

		int numberOfPoints = data.nextInt();

		String[] birthdates = new String[numberOfPoints];
		String[] telephones = new String[numberOfPoints];
		double[] heights = new double[numberOfPoints];

		for(int i = 0; i < heights.length ; i++){
			birthdates[i] = data.next();
			telephones[i] = data.next();
			heights[i] = Double.parseDouble(data.next());
		} 

		System.out.println("The average height is: " + DoubleArrays.averageOfAnArray(heights));
		System.out.println("The minimum height is: " + DoubleArrays.minValue(heights));
		System.out.println("The maximum height is: " + DoubleArrays.maxValue(heights));
		DoubleArrays.printThisArray(heights);

	}
}