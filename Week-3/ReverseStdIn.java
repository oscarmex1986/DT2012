import java.util.Scanner;

public class ReverseStdIn{

  public static void main(String[] args) {

    Scanner data = new Scanner(System.in);

    while(data.hasNext()){
      System.out.println(data.next());
    }

  }

}
