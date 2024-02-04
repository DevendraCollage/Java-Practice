
//* Practice Set of Chapter-2 of Java
import java.util.Scanner;

public class Chapter_2_PS {
    public static void main(String[] args) {
        // ? Create object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // ! 1. What will be the result of the following expression: float a = 7/4 * 9/2
        float a1 = 7 / 4.0f * 9 / 2.0f;
        /*
         * = 7 / 4 * 9 / 2
         * = 1.75 * 9 / 2
         * = 15.75 / 2
         * = 7.875
         */
        System.out.println(a1); // ? Output: 7.875

        // ! 2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to
        // show the correct grade.
        char grade = 'a' + 8;
        System.out.println("Encrypt the grade from a to i : " + grade);
        char grade2 = (char) (grade - 8);
        System.out.println("Decrypt the grade from i to a : " + grade2);

        // ! 3. Use comparison operators to find out whether a given number is greater
        // than the user entered number or not.
        // ? Get the number from the user
        System.out.print("Enter The Number Here : ");
        int getNumber = sc.nextInt();
        if (getNumber > 0) {
            System.out.println(getNumber + " Is Positive Number!");
        } else if (getNumber == 0) {
            System.out.println(getNumber + " Is Equal To 0!");
        } else {
            System.out.println(getNumber + " Is Negative Number!");
        }

        // ! 4. Write the following expression in a java program:
        // ! = (v^2-u^2)/2as
        int v = 2;
        int u = 2;
        int s = 5;
        int a = 2;
        int expression = (v ^ v - u ^ u) / 2 * a * s;
        System.out.println(expression);

        // ! 5. Find the value of 'a' in expression given below :
        int x = 7;
        int a2 = x * 49 / x + 35 / x;
        /*
         * = x * 49 / x + 35 / x
         * = 7 * 49 / 7 + 35 / 7
         * = 49 + 5
         * = 54
         */
        System.out.println(a2); // ? Output: 54

        sc.close();
    }
}
