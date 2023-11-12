import java.util.Scanner;

/*
The program checks if the number given in the command line
 is among the numbers in standard input.

*/
public class SearchStdIn{

  public static void main(String[] args) {

    double num = Double.parseDouble(args[0]);

    Scanner data = new Scanner(System.in);

    boolean found = false;

    while(data.hasNext()  && !found){

      if (data.nextDouble() == num){
        found = true;
      }

    }

    if (found) {System.out.println("Found!");}
    else {System.out.println("NOT found!");}

  }

}
