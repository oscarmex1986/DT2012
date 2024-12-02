import java.awt.Color;

public class Grayscale{
	private static void grayscale(Picture pic){
		int width = pic.width();
		int height = pic.height();

		for (int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				Color color = pic.get(x, y);
				Color gray = Luminance.toGray(color);
				pic.set(x, y, gray);
			}
		}
	}
	public static void main(String[] args){
		Picture pic = new Picture(args[0]);
		grayscale(pic);
		pic.save("gray-"+args[0]);
		pic.show();
	}
}