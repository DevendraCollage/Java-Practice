//* Write a program to find that given number or string is palindrome or not.

import java.util.*;

public class StringPalin {
    public static void main(String[] args) {
        // Create the instance of the scanner class
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        System.out.println("Enter he string here : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                flag = false;
                break;
            }
        }

        System.out.println();

        if (flag) {
            System.out.println(str);
            System.out.println("The String is palindrome!");
        } else {
            System.out.println(str);
            System.out.println("The String is not palindrome!");
        }

        sc.close();
    }
}
