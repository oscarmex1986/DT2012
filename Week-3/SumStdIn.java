import java.util.Scanner;

public class SumStdIn{
  public static void main(String[] args) {

    Scanner user = new Scanner(System.in);

    int sum = 0;
    while(user.hasNext()){
      sum = sum + user.nextInt();
    }
    System.out.println(sum);
  }
}
