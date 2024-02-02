import java.util.*;

public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ? Make the object of the Scanner class to use the method of the Scanner
        // ? System.in - Is use to get the input read data from the key-board

        // ? Get two number from the user and perform the Arithmetic operation on it
        System.out.print("Enter Number One : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number Two : ");
        int num2 = sc.nextInt();

        // ? Output the result to the user
        System.out.println("The Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("The Subtraction of " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("The Multiplication of " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("The Division of " + num1 + " / " + num2 + " = " + (num1 / num2));

        sc.close();
    }
}