import java.awt.Color;

public class ImageProcessing{
	public static void main(String[] args){
		// Read the address for a picture from the command line
		Picture pic = new Picture(args[0]);
		// Go through every pixel in the picture
		for(int x = 0; x < pic.width(); x++){
			for(int y = 0; y < pic.height(); y++){
				// For every pixel, randomize the amount of G
				// First, I get the values for R, G, B
				Color color = pic.get(x,y); // This gives me the RGB mix
				int red = color.getRed(); // an integer with the value for R channel
				int green = (int)(Math.random()*128);
				int blue = color.getBlue();
				Color newColor = new Color(red, green, blue); // I create a new color
				pic.set(x,y,newColor); //Replace the color with a modified Green channel
			}
			
		}
			

		// Show the picture
		pic.show();
	}
}
