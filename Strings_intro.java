
//* Introduction to String in java
import java.util.*;

public class Strings_intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ! String are immutable you can not change
        // ? In java String is a class but you can use as a primitive data type
        String name = new String("Devendra");
        System.out.println(name);

        // * Make an string in another way like this
        String name2 = "Devendra";
        System.out.println(name2);

        // ? we can get the string from the user
        System.out.print("Enter Your Designation Here : ");
        String designation = sc.nextLine();
        System.out.println("Your Designation Is : " + designation);
        System.out.println();

        // * Length of the string using length() method
        int len = designation.length();
        System.out.println("Length Of The designation Is : " + len);

        sc.close();
    }
}