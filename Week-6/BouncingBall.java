/*
  OLD EXERCISE!

  This file should be used for solving exercises 1 and 2.

  In  exercise 1 you have to complete the code of a  constructor. 
  See the comment starting with Exercise 1.

  In exercise 2 you have to modify the method bounceY. 
  See the comment starting with Exercise 2.
*/

import java.awt.Color;
public class BouncingBall{
  private double x;
  private double y;
  private double r;
  private Color color;
  private double stepX;
  private double stepY;

  public BouncingBall(double cx, double cy, double rad,
                      Color col, double velX, double velY){
      x = cx;
      y = cy;
      r = rad;
      color = col;
      stepX = velX;
      stepY = velY;
  }

    /*
      Exercise 1:
      Add a constructor to create black balls.
      This constructor has the same arguments as the other constructor
      except for the color: it does not have a color argument and sets
      the ball color to black.
    */
    public BouncingBall(double cx, double cy, double rad,
                        double velX, double velY){
          // Your code here.
    }


  public void draw(){
    StdDraw.setPenColor(color);
    StdDraw.filledCircle(x,y,r);
  }

  public void move(){
    x = x + stepX;
    y = y + stepY;
  }


  public void bounceX(){
    stepX = -stepX;

  }

  /*
    Exercise 2:
    Modify bounceY so that the ball looses "energy" when bouncing in the Y
    direction:
        the velocity in the Y direction after the bounce changes sign and
        changes value to 80% of the value it had before the bounce.
  */
  public void bounceY(){
    stepY = -stepY;
  }

  public boolean collideX(double xBorder){
    return Math.abs(x + stepX) + r > Math.abs(xBorder);
  }

  public boolean collideY(double yBorder){
    return Math.abs(y + stepY) + r > Math.abs(yBorder);
  }

  public String toString(){
    return "[Ball at (" + x + ", " + y +
           ") with radius " + r + " and velocity (" +
            stepX + ", " + stepY + ")]" ;
  }

  public static void main(String[] args) {

    BouncingBall b = new BouncingBall(.5, .5, .2, Color.red, 0.1,0.15);

    System.out.println(b);
    b.move();
    System.out.println(b);
    b.draw();

    BouncingBall c = new BouncingBall(.5, .5, .2, 0.1,0.15);
    System.out.println(c);
    c.bounceY();
    System.out.println(c);
    c.draw();
  }

}
