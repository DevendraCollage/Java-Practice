/*
 * The marks obtained by a student in 5 different subjects are input through the keyboard.
 * The student gets a division as per the following rules:
 * I. Percentage above or equals to 60-first division
 * II. Percentage between 50 to 59-second division
 * III. Percentage between 40 and 49-Third division
 * IV. Percentage less than 40-fail
 * Write a program to calculate the division obtained by the student.
 */

import java.util.*;

public class Result {
    public static void main(String[] args) {
        // Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Get the 5 subject marks from the user
        System.err.print("Enter the sub-1 marks here : ");
        int sub1 = sc.nextInt();
        System.err.print("Enter the sub-2 marks here : ");
        int sub2 = sc.nextInt();
        System.err.print("Enter the sub-3 marks here : ");
        int sub3 = sc.nextInt();
        System.err.print("Enter the sub-4 marks here : ");
        int sub4 = sc.nextInt();
        System.err.print("Enter the sub-5 marks here : ");
        int sub5 = sc.nextInt();

        // Calculate the total of the 5 subject
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Your total is : " + total);

        // Calculate the percentage
        float percentage = total / 5;
        System.out.println("Your Percentage is : " + percentage);

        // Print the result
        if (percentage >= 60) {
            System.out.println("You got a first division!");
        } else if (percentage >= 50 && percentage < 59) {
            System.out.println("You got a second division!");
        } else if (percentage >= 40 && percentage < 49) {
            System.out.println("You got a third division!");
        } else {
            System.out.println("You are fail!");
        }

        sc.close();
    }
}
