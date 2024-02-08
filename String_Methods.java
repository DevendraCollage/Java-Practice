
//? Introduction to some string methods
import java.util.*;

public class String_Methods {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ! String it immutable means you can not change to original string
        String name = "Devendra"; // * Perform all string method on this string

        // ! 1. Find the length of the string
        System.out.println(name.length());

        // ! 2. Convert the string to lowercase letters
        System.out.println(name.toLowerCase());

        // ! 3. Convert the string to uppercase letters
        System.out.println(name.toUpperCase());

        // ! 4. Remove extra white spaces from the string
        System.out.println(name.trim());

        // ! 5. You can print the string after index you can pass in the function
        System.out.println(name.substring(2)); // ? In this end will get by default to he length of the string

        // ! 6. You can print the string between the start to end index in string
        System.out.println(name.substring(2, 4)); // ? This will included the 2 to 3 not the 4

        // ! 7. Replace any string with new string
        System.out.println(name.replace('D', 'R')); // ? This will replace the D with R in my name
        // ? This will replace all the character in the string with new character not
        // only first

        // ! 8. Check string starts with any letter or not
        System.out.println(name.startsWith("D")); // ? This wil return boolean value - true
        System.out.println(name.startsWith("d")); // ? This wil return boolean value - false

        // ! 9. Check ending with any letter or not
        System.out.println(name.endsWith("a"));// ? true
        System.out.println(name.endsWith("e"));// ? false

        // ! 10. Access Particular character from the string
        // ! This will return which character at the index you are passing in the
        System.out.println(name.charAt(2)); // ? Output: v

        // ! 11. This will return the index of the characters in the string
        System.out.println(name.indexOf("e")); // ? if multiple character are there this will return only first index
                                               // character

        // ! 12. This will return the index of the last characters in the string
        System.out.println(name.lastIndexOf("a"));

        String name2 = "Devendra";

        // ! 13. This will check the string is equals or not
        System.out.println(name.equals(name2)); // ? True
        System.out.println(name == name2); // ? You can check the equality like this but this is the wrong way - True

        // ! 14. This will check the string but ignore the case like capital or small
        System.out.println(name.equalsIgnoreCase(name2)); // ? True

        sc.close();
    }
}
