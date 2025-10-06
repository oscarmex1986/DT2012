public class Complex{

  final private double re;
  final private double im;

  public Complex(double x, double y){
      re = x;
      im = y;
  }

  public Complex(double x){
    re = x;
    im = 0;
  }

  public Complex plus(Complex z){
      return new Complex(re + z.re, im + z.im);
  }

  public String toString(){
    return re + " + i" + im;
  }

  public static void main(String[] args) {
    Complex z1 = new Complex(2,3);
    Complex z2 = new Complex(5,-4);


    System.out.println(z1.plus(z2));
  }
}
