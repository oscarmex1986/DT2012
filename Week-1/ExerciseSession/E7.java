/*
This program is compiled using
   javac E7.java

and is ran using
   java E7 4 6

The numbers 4 and 6 are called the command line arguments
and are the input to the program.

The output for this input is
    [ 4 divides 6 ] is  false

The purpose of the program is to output whether
the first input number divides the second input number.

Your task is to write the assignment needed to give the variable
mDividesN a truth value:
   true if the first input number divides the second input number
   false otherwise
*/
public class E7{

  public static void main(String[] args) {

    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);
    boolean mDividesN = false;

    // YOUR TASK: assign to mDividesN
    // the truth value of [ m divides n ]

    System.out.println("[ " + m + " divides " + n + " ] is  "
                      + mDividesN);

  }

}
