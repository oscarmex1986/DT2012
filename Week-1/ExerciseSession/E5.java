/*

Assign values to plus_mod and times_mod so that their values
are [x + y] and [x * y] in Z_n (recall the math lectures from LP1)

*/

public class E5{

  public static void main(String[] args) {

    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int n = Integer.parseInt(args[2]);

    // Modify these two assignments to assign the required values.
    int plus_mod  = 0;
    int times_mod = 0;

    System.out.println("[" + x + " + " + y + "] in Z_" + n
                      + " is " + plus_mod);
    System.out.println("[" + x + " * " + y + "] in Z_" + n
                      + " is " + times_mod);
  }

}
