import java.util.*;
// todo: Write a program to print first n odd numbers using a for loop

public class Quick_Quiz3 {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ? Get number from the user where should you print odd number
        System.out.print("Enter The Number you want to print : ");
        int userNum = sc.nextInt();

        // ? Print that user odd number of the user choice
        System.out.println("\nFrom 1 to " + userNum + " Odd Numbers are");
        for (int i = 1; i <= userNum; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        // ? Print that user odd number of the user choice
        System.out.println("Print n natural number from " + userNum + " to 1 in reveres order!");
        for (int i = userNum; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
