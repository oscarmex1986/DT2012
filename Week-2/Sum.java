public class Sum{

  public static void main(String[] args) {
    long bound = Integer.parseInt(args[0]);

    long sum = 0;

    for (int i = 1; i <= bound ; i++ ) {
      sum = sum + i;
    }

    long gauss = bound*(bound + 1)/2;

    System.out.println(sum);
    System.out.println(gauss);
  }

}
