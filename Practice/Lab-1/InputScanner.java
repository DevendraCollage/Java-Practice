import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) { 
        // Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Get the two number from the user
        System.out.print("Enter the number 1 here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 here : ");
        int num2 = sc.nextInt();

        // Print the two number on the screen
        System.out.println("You entered number 1 is : " + num1);
        System.out.println("You entered number 2 is : " + num2);

        sc.close();
    }    
}
