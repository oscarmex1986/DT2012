public class MinArray{

  public static void main(String[] args) {

    int min = Integer.MAX_VALUE;

    for (int i = 0; i < args.length; i++) {
      int y = Integer.parseInt(args[i]);

      if(y < min){
          min = y;
      }

    }

    System.out.println(min);
  }
}
