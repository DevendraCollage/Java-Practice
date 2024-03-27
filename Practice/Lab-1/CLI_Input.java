public class CLI_Input {
    public static void main(String[] args) {
        // Get the input from Command Line Input
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Print the this number on the screen
        System.out.println("Number 1 : " + num1);
        System.out.println("Number 2 : " + num2);
    }
}