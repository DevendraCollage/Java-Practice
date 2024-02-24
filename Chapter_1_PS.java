//* Practice Set of Chapter-1 of Java

import java.util.Scanner;   

public class Chapter_1_PS {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ! 1. Write a program to sum three numbers in Java.
        // ? Get number from the user
        System.out.print("Enter The Number 1 : ");
        float n1 = sc.nextFloat();
        System.out.print("Enter The Number 2 : ");
        float n2 = sc.nextFloat();
        System.out.print("Enter The Number 3 : ");
        float n3 = sc.nextFloat();
        // ? Perform sum of this three number
        float sum = n1 + n2 + n3;
        // ? Display the result
        System.out.println("The Sum of this three number is : " + sum);

        // ! 2. Write a program to calculate CGPA using marks of three subjects (out of
        // ! 100)
        // ? Get the Marks of each subject from the user
        System.out.print("Enter The Marks of Subject 1 : ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter The Marks of Subject 2 : ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter The Marks of Subject 3 : ");
        float sub3 = sc.nextFloat();
        // ? Calculate the Sum of the marks
        float sumMarks = sub1 + sub2 + sub3;
        // ? Find the percentage
        float percentage = sumMarks / 3;
        // ? Find out the CGPA
        float CGPA = percentage / 9.5f;
        // ? Print all the results
        System.out.println("Your Total of this : " + sumMarks);
        System.out.println("Your Percentage is this : " + percentage);
        System.out.println("Your CGPA is this : " + CGPA);

        // ! 3. Write a Java program that asks the user to enter his/her name and greets
        // them with “Hello <name>, have a good day” text.
        // ? Get the name of the user
        System.out.print("Enter Your Name Here : ");
        String name = sc.nextLine();
        // ? greets them with “Hello <name>, have a good day” text
        System.out.println("Hello " + name + ", have a good day.");

        // ! 4. Write a Java program to convert Kilometers to miles.
        // ? Get the kilometers from the user
        System.out.print("Enter The Distance in kilometers : ");
        int km = sc.nextInt();
        // ? Convert the kilometers in miles
        float miles = km * 0.621371f;
        System.out.println("The kilometers is converted into miles : " + miles);

        // ! 5. Write a Java program to detect whether a number entered by the user is
        // an integer or not. If it’s an integer, print “It’s An Integer”. If it’s not
        // ? Get the integer number from the user
        System.out.print("Enter The Number Here : ");
        boolean isInteger = sc.hasNextInt();
        if (isInteger) {
            System.out.println("Yes, This is an Integer!");
        } else {
            System.out.println("No, This is not an Integer!");
        }

        sc.close();
    }
}
