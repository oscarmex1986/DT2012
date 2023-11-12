public class ReverseArray{

  public static void main(String[] args) {
      // modify args to have the same elements but in reversed order

      for (int i = 0; i < args.length / 2 ; i++) {
        String tmp = args[i];
        args[i] = args[args.length - 1 - i];
        args[args.length -1 - i] = tmp;
      }

      for (int i = 0; i < args.length ; i++) {
        System.out.print(args[i] + " ");
      }
      System.out.println();

  }

}
