import java.util.Scanner;

public class MinStdIn{
  public static void main(String[] args) {

    Scanner user = new Scanner(System.in);

    int min = Integer.MAX_VALUE;

    while(user.hasNext()){
      int y = user.nextInt();

      if(y < min){
            min = y;
      }

    }
    System.out.println(min);
  }
}
