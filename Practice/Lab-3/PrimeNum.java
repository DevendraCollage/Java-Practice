//* Write a program to check that the given number is prime or not.

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        // Create the instance of the Scanner class
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        // Get the number from the user
        System.out.print("Enter the number here : ");
        int num = sc.nextInt();

        // Check the number is prime or not
        for(int i = 2; i<num-1; i++) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        if(flag) {
            System.out.print("The number is prime number!");
        }else{
            System.out.print("The number is not prime!");
        }
    }
}
