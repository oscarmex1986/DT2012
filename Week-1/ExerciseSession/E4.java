/*

Assign to the variable tell_me_the_hour what the time is
given the current hour and a number of hours to add.

From the math lectures last study period:
 If the current hour is 8, in 78 hours the time will be 14.
 If the current hour is 8, 53 hours ago the time was 3.

Test your solution with both these examples.
*/

public class E4 {

  public static void main(String[] args) {

    int current_hour = Integer.parseInt(args[0]);
    int added_hours  = Integer.parseInt(args[1]);

    // Your task:
    // change 0 to the expression with the required value
    int tell_me_the_hour = 0;

    System.out.println("In "
                      + added_hours
                      + " the time would be "
                      + tell_me_the_hour);

  }

}
