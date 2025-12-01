/*
  THIS IS AN OLD EXERCISE!!!
*/
public class Complex{

  private final double re;
  private final double im;

  public static final Complex I = new Complex(0,1);

  public Complex(double real, double imag){
    re = real;
    im = imag;
  }

  public Complex(double real){
    re = real;
    im = 0;
  }

  public Complex plus(Complex that){
    double real = this.re + that.re;
    double imag = this.im + that.im;
    return new Complex(real, imag);
  }

  public Complex times(Complex that){
    double real = this.re * that.re - this.im * that.im;
    double imag = this.re * that.im + this.im * that.re;
    return new Complex(real, imag);
  }

  public boolean equals(Complex that){
    return this.re == that.re && this.im == that.im;
  }

  /*
    Exercise 7:
     Modify the implementation so that if the imaginary part is a negative
     number im, the resulting string is
       re - |im| instead of re + im (where im has a leading -).
     For example the complex number with real part 3 and imaginary part -4
     should result in the string 3.0 - 4.0i 
     (instead of 3.0 + -4.0i as it does with the given implementation)
  */
  public String toString(){
    if (im == 0){return ""+re;}
    if (re == 0){return im + "i";}
    return re + " + " + im + "i";
  }

  /*
    Exercise 8:
    Complete the definition of scale to be the operation that multiplies a
    real number by a complex number:
    See the lecture on 'komplexatal' in the course 'Algebra och diskret
    matematik', Raekneregler foer komplexatal.
          xz = xa+ixb for z a complex number a + ib and x a real number
  */
  public Complex scale(double x){
    // Your code here.
    return null;
  }

  /*
    Exercise 9:
    Complete the definition of minus according to
       z1 - z2 = z1 + (-1)z2
    (See the lecture on 'komplexatal' in the course 'Algebra och diskret
    matematik', Raekneregler foer komplexatal)
  */
  public Complex minus(Complex that){
    // Your code here.
    return null;
  }

  /*
    Exercise 10:
    Complete the definition of abs according to
     |z| = sqrt(a^2 + b^2) for z a complex number a + ib
     (See the lecture on 'komplexatal' in the course 'Algebra och diskret
     matematik', Absolutbelopp och konjugat)
  */
  public double abs(){
    // Your code here.
    return 0;
  }

  /*
    Exercise 11:
    Complete the definition of conjugate according to
    z conjugate = a - ib for z a complex number a + ib
    (See the lecture on 'komplexatal' in the course 'Algebra och diskret
     matematik', Absolutbelopp och konjugat)
  */
  public Complex conjugate(){
    // Your code here.
    return null;
  }

  /*
    Exercise 12:
    Complete the definition of quotient according to
    z1/z2 = z1 (z2 conjugate)/|z2|^2
    (See the lecture on 'komplexatal' in the course 'Algebra och diskret
     matematik', Division)
  */
  public Complex quotient(Complex that){
    // Your code here.
    return null;
  }


  public static void main(String[] args) {
    System.out.println("i*i = " + I.times(I));

    Complex z1 = new Complex(2, 3);
    Complex z2 = new Complex(5, -4);
    System.out.println(z1 + " plus " + z2 + " = " + z1.plus(z2));
    System.out.println(z1 + " scaled with -1 is: " + z1.scale(-1));
    System.out.println(z1 + " minus " + z2 + " = " + z1.minus(z2));
    System.out.println("The absolute value of " + z1 + " is: " + z1.abs());
    System.out.println("The conjugate of " + z1 + " is: " +z1.conjugate());


    Complex z3 = new Complex(5,15);
    Complex z4 = new Complex(1,-3);
    System.out.println(z3 + " quot " + z4 + " = " + z3.quotient(z4));
  }
}
