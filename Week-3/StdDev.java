import java.util.Scanner;
import java.util.Locale;

public class StdDev{
  public static void main(String[] args) {
    int count = Integer.parseInt(args[0]);

    Scanner user = new Scanner(System.in).useLocale(Locale.US);

    double sum = 0;

    double[] values = new double[count];

    for (int i = 0;i < count ;i++ ) {
      values[i] = user.nextDouble();
      sum = sum + values[i];
    }
    double average = sum / count;

    double variance = 0;
    for (int i = 0; i < count ; i++) {
        variance = variance
                    +
                    (values[i]-average)*(values[i]-average);
    }
    variance = variance / count;

    double sigma = Math.sqrt(variance);
    
    System.out.println(average);
    System.out.println(sigma);
  }
}
