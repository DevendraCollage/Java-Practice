public class SumCLI {
    public static void main(String[] args) {
        // Get the two number from the CLI
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        // Perform the sum of the two numbers
        double sum = num1 + num2;

        // Print the sum on the screen
        System.out.println("The sum of the two numbers is: " + sum);
    }    
}
