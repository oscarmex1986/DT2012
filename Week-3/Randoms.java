public class Randoms{
  public static void main(String[] args) {
    int count = Integer.parseInt(args[0]);
    for (int i = 0; i < count ;i++ ) {
      System.out.print(Math.random() + " ");
    }
    System.out.println();
  }
}
