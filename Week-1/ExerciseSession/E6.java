/*
This program is compiled using
   javac E6.java

and is ran using
   java E6 4

The number 4 is called the command line argument
and is the input to the program.

The output for this input is
    [ 3 divides 4 ] is  false

The purpose of the program is to output whether
the first input number divides the second input number.

Your task is to write the assignment needed to give the variable
threeDividesN a truth value:
   true if 3 divides the input number
   false otherwise
*/
public class E6{

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    boolean threeDividesN = false;

    // YOUR TASK: assign to threeDividesN
    // the truth value of [ 3 divides n ]

    System.out.println("[ 3 divides " + n + " ] is  " + threeDividesN);

  }

}
