//* Write a program to find maximum no from given 3 no.

import java.util.*;

public class Max3 {
    public static void main(String[] args) {
        // Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Get the three number from the user
        System.out.print("Enter the number 1 here : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number 2 here : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the number 3 here : ");
        int num3 = sc.nextInt();

        // Check the which number is max
        if(num1>num2 && num1>num3) {
            System.out.printf("The %d is Greater Among Them!",num1);
        }else if (num2>num3) {
            System.out.printf("The %d is Greater Among Them!",num2);
        }else{
            System.out.printf("The %d is Greater Among Them!",num3);
        }


        sc.close();
    }
}
