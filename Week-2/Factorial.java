public class Factorial{

  public static void main(String[] args) {
    int factorial = 1;

    for (int i = 1; i <= 3 ; i = i + 1 ) {
      factorial = factorial * i;
    }
    System.out.println(factorial);
  }

}
