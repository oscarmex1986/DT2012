// To run this program, use, for example:
// java OperationsWithArguments Oscar 39 1.84

public class OperationsWithArguments {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double height = Double.parseDouble(args[2]);

        System.out.println(name + " is " + age + " years old and " + height + " meters tall.");
      
        String firstThreeLetters = name.substring(0, 2);
        System.out.println("First three letters of the name: " + firstThreeLetters);
    }
}
