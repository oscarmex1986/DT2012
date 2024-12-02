import java.awt.Color;

public class E4{
	public static void main(String[] args){
		Picture p = new Picture(500,500);
		Color w = new Color(255,255,255);
		for (int x = 0; x < 500; x++){
			for (int y = 0; y < 500; y++){
				p.set(x, y, w);
			}
		}
		p.show();
	}
}
