//* Practice Set of Chapter-5 of Java

import java.util.*;

public class Chapter_5_PS {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ! 1. Write a program to print the following pattern :
        // ****
        // ***
        // **
        // *
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ! 2. Write a program to sum first n even numbers using a while loop.
        // ? Get the user input
        System.out.print("Enter The Number you want : ");
        int userInput = sc.nextInt();
        // ? Sum of first n even numbers
        int sum = 0;
        int i = 1;
        while (i <= userInput) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        // ? Print the sum of first n even numbers
        System.out.println("The Sum Of First " + userInput + " Even Numbers Is: " +
                sum);

        // ! 3. Write a program to print the multiplication table of a given number n.
        // ? Get the number from the user wants to generate its multiplication table
        System.out.print("Enter the number you want to print multiplication table : ");
        int userI = sc.nextInt();
        // ? print the multiplication table
        for (int i1 = 1; i1 <= 10; i1++) {
            System.out.println(userI + " * " + i1 + " = " + (i1 * userI));
        }

        // ! 4. Write a program to print a multiplication table of 10 in reverse order.
        // ? Get the number from the user wants to generate its multiplication table in
        // reverse order
        System.out.print("Enter the number you want to print multiplication table : ");
        int userInp = sc.nextInt();
        // ? print the multiplication table
        for (int i2 = 10; i2 >= 1; i2--) {
            System.out.println(userInp + " * " + i2 + " = " + (i2 * userInp));
        }

        // ! 5. Write a program to find the factorial of a given number using for loops.
        // ? Get the input from the user to print the factorial of that user number
        System.out.print("Enter the number to print factorial number : ");
        int userIn = sc.nextInt();
        // ? Calculate the factorial of the user input
        int fact = 1;
        for (int i3 = 1; i3 <= userIn; i3++) {
            fact = fact * i3;
        }
        // ? Print the factorial of the user number
        System.out.println("Factorial Of " + userIn + " is : " + fact);

        // ! 6. Repeat problem 5 using a while loop.
        // ? Get the input from the user to print the factorial of that user number
        System.out.print("Enter the number to print factorial number : ");
        int userInput2 = sc.nextInt();
        // ? Calculate the factorial of the user input
        int fact1 = 1;
        int i4 = 1;
        while (i4 <= userInput2) {
            fact1 = fact1 * i4;
            i4++;
        }
        // ? Print the factorial of the user entered number
        System.out.println("Factorial Of " + userInput2 + " is : " + fact1);

        // ! 7. Repeat problem 1 using while/do-while loop.
        // ? 1. Using while loop
        int i5 = 5;
        while (i5 >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i5--;
        }

        // ? 2. Using do-while loop
        int i1 = 5;
        do {
            int j = 1;
            do {
                System.out.print("* ");
                j++;
            } while (j <= i1);
            System.out.println();
            i1--;
        } while (i1 >= 1);

        // ! 8. What can be done using one type of loop can also be done using the other
        // two types of loops - True or False.
        // ? Answer: True

        // ! 9. Write a program to calculate the sum of the numbers occurring in the
        // multiplication table of 8.
        // ? Get the number from the user
        System.out.print("Enter the number you want multiplication table : ");
        int mul = sc.nextInt();
        int sum1 = 0;
        // ? Print the multiplication table
        for (int i6 = 1; i6 <= 10; i6++) {
            System.out.println(mul + " * " + i6 + " = " + (i6 * mul));
            sum1 += i6 * mul;
        }
        // ? Print the sum of numbers occurring in the multiplication table.
        System.out.println("The sum of numbers in the multiplication table is : " + sum1);

        // ! 10. A do-while loop is executed:
        // ? -> At least once whether the condition is true or false

        // ! 11. Repeat problem 2 using for loop.
        // ? Get the number from the user
        System.out.print("Enter the number here : ");
        int userNum = sc.nextInt();
        int sum2 = 0;
        // ? Calculate the sum of the first n even numbers
        for (int i7 = 1; i7 <= userNum; i7++) {
            if (i7 % 2 == 0) {
                sum2 += i7;
            }
        }
        // ? Print the sum of the first n even numbers
        System.out.println("Sum of the first " + userNum + " even numbers are : " + sum2);

        sc.close();
    }
}