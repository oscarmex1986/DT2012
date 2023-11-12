import java.util.Scanner;

public class GoThroughStdIn{
  public static void main(String[] args) {

    Scanner user = new Scanner(System.in);

    while(user.hasNext()){
      System.out.println(user.next());

    }
  }
}
