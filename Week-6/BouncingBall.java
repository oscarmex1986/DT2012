import java.awt.Color;

public class BouncingBall{

  private double x;
  private double y;
  private double r;
  private Color c;
  private double stepX;
  private double stepY;

  public BouncingBall(double cx, double cy, double rad,
                      Color col,
                      double vx, double vy){
      x = cx;
      y = cy;
      r = rad;
      c = col;
      stepX = vx;
      stepY = vy;
  }

  public void draw(){
    StdDraw.setPenColor(c);
    StdDraw.filledCircle(x, y, r);
  }



}
