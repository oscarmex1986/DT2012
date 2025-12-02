// Program to test the coordinate class
import java.util.Scanner;
public class TestCoordinate{
	public static void main(String[] args){
		// Import the coordinates from the eu capitals
		Scanner data = new Scanner(System.in);

		int nPoints = data.nextInt();

		// Store all coordinates in an array
		Coordinate[] cities = new Coordinate[nPoints];

		// Fill up the array
		for(int i = 0; i < cities.length; i++){
			cities[i] = new Coordinate(Double.parseDouble(data.next()),Double.parseDouble(data.next()));
		}

		// The distance from halmstad cities[0] to every other city
		for(int i = 0; i < cities.length; i++){
			double distance = cities[0].distanceTo(cities[i]);
			System.out.println("The distance from Halmstad to " + cities[i].toString() + " is " + distance);
		}

	}
}