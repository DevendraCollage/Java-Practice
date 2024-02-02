//* Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        // ? Create instance of the Scanner class to use the inbuilt method
        Scanner sc = new Scanner(System.in);

        // ? Get the Marks of 5 subjects from the user
        System.out.print("Enter The Marks of 1 Subject : ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter The Marks of 2 Subject : ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter The Marks of 3 Subject : ");
        float sub3 = sc.nextFloat();
        System.out.print("Enter The Marks of 4 Subject : ");
        float sub4 = sc.nextFloat();
        System.out.print("Enter The Marks of 5 Subject : ");
        float sub5 = sc.nextFloat();

        // ? Calculate the total of the student marks
        float total = sub1 + sub2
                + sub3 + sub4 + sub5;

        // ? Calculate the percentage of the student marks
        float percentage = total / 5;

        // ? Print the result to the user screen
        System.out.println("The Total of the All The Subjects is : " + total);
        System.out.println("The Percentage Is : " + percentage);

        sc.close();
    }
}
