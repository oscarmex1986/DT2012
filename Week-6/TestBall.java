import java.awt.Color;

public class TestBall{
  public static void main(String[] args) {
    BouncingBall b1 = new BouncingBall(0.5,0.5, 0.2, Color.BLUE, 0,0);

    BouncingBall b2 = new BouncingBall(0.5,0.5, 0.1, Color.RED, 0,0);

    b1.draw();
    b2.draw();
  }

}
