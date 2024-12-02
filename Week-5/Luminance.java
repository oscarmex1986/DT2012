import java.awt.Color;

public class Luminance{

  public static double lum(Color c){
    int r = c.getRed();
    int g = c.getGreen();
    int b = c.getBlue();
    double l = 0.299*r + 0.587*g + 0.114*b;
    return l;
  }

  public static Color toGray(Color c){
    int lu = (int)lum(c);
    Color gv = new Color(lu,lu,lu);
    return gv;
  }

  public static void main(String[] args) {
    Color col = new Color(255,0,0);

    StdDraw.setPenRadius(1);
    StdDraw.setPenColor(col);
    StdDraw.point(0.5,0.5);

    StdDraw.setPenRadius(0.5);
    StdDraw.setPenColor(toGray(col));
    StdDraw.point(0.5,0.5);



  }
}
