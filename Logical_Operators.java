import java.util.*;
//! Logical operators are use to provide the logic to our program

public class Logical_Operators {
    public static void main(String[] args) {
        // ? Scanner class object to get input from the user
        Scanner sc = new Scanner(System.in);

        // * 1. Logical And
        boolean a1 = true;
        boolean a2 = false;
        if (a1 && a2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // ? Explanation
        /*
         * This will return false because a1 is true and a2 is false and if will match
         * those condition then this one condition will false then overall process false
         * then this will return the false
         */

        // * 2. Logical Or
        boolean a11 = true;
        boolean a22 = false;
        if (a11 || a22) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // ? Explanation
        /*
         * This will return true because a11 is true and a22 is false and if will match
         * those condition then this one condition will true then overall process true
         * then this will return the true
         */

        // * 3. Logical Not
        boolean a111 = true;
        boolean a222 = false;
        System.out.println("Not(A111) is : " + !(a111));
        System.out.println("Not(A222) is : " + !(a222));
        // ? Explanation
        /*
         * This will invert the condition to reverse false -> true and true -> false
         */

        sc.close();
    }
}