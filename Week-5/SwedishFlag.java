import java.awt.Color;

public class SwedishFlag{
	public static void main(String[] args){
		Picture pic = new Picture(160,100);
		Color baseColor = new Color(0,82,147); // Sweden blue
		Color anotherColor = new Color(254,204,2); // Sweden yellow

		for(int x = 0; x < pic.width(); x++){
		// This for loop goes through all the x coordinates
			for(int y = 0; y < pic.height(); y++){
			//This for loop goes through all the y coordinates
				if((x >= 50 && x <= 70) || (y >= 40 && y <= 60)) { // If x >= 50 AND x <= 70  y >= 40 AND y <= 60
					pic.set(x,y,anotherColor);
				} else {
					pic.set(x,y,baseColor); // Set the color for the x,y pixel	
				}
				
			}

		}
		// Show the image
		pic.show();
	} 
}
