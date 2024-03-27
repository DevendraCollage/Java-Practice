//* Write a program to get 2 numbers from the user and print the sum of two numbers using command line and Scanner class.

import java.util.*;

public class SumCLI_Scanner {
    public static void main(String[] args) {
        // ? 1. Perform sum of two number using Scanner class
        // Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Get the two number from the user
        System.out.print("Enter the number 1 here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 here : ");
        int num2 = sc.nextInt();

        // Perform the sum of this number
        int sum = num1 + num2;

        // Print the sum on the screen
        System.out.println();
        System.out.println("Sum using Scanner class!");
        System.out.printf("The sum of %d + %d is : %d\n", num1, num2, sum);

        sc.close();

        // ? 2. Perform sum of two number using CLI
        // Get the number from the CLI
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        // Perform the sum
        int sumCLI = n1 + n2;

        // Print the sum on the screen
        System.out.println();
        System.out.println("Sum using CLI!");
        System.out.printf("The sum of %d + %d = %d\n", n1, n2, sumCLI);
    }
}
