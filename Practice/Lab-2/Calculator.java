
//* Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from the user and apply the operation given in a string on the given numbers.

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        // Create the instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Get the two number and one string operation from the user
        System.out.print("Enter the number 1 here : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number 2 here : ");
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the operation you want to perform (+,-,*,/) : ");
        String opr = sc.nextLine();

        // Perform operation according to the user choice
        switch (opr) {
            case "+":
                System.out.printf("The Addition of %d + %d : %d", n1, n2, (n1 + n2));
                break;
            case "-":
                System.out.printf("The Subtraction of %d - %d : %d", n1, n2, (n1 - n2));
                break;
            case "*":
                System.out.printf("The Multiplication of %d * %d : %d", n1, n2, (n1 * n2));
                break;
            case "/":
                System.out.printf("The Division of %d / %d : %d", n1, n2, (n1 / n2));
                break;
            default:
                System.out.println("Enter the valid operation!");
                break;
        }

        sc.close();
    }
}
