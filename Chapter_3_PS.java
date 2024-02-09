
//* Practice Set of Chapter-3 of Java
import java.util.Scanner;

public class Chapter_3_PS {
    public static void main(String[] args) {
        // ? Create object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // ! 1. Write a Java program to convert a string to lowercase.
        String myName = "  Devendra  ";
        System.out.println(myName.toLowerCase());

        // ! 2. Write a Java program to replace spaces with underscores.
        System.out.println(myName.replaceAll(" ", "_"));

        // ! 3. Write a Java program to fill in a letter template
        // ? Get name from the user
        System.out.print("Enter Your Name Here : ");
        String userName = sc.nextLine();
        System.out.println("Dear " + userName + ", Thanks a lot!");

        // ! 4. Write a Java program to detect double and triple spaces in a string.
        System.out.println(myName.indexOf("  "));

        // ! 5.Write a program to format the following letter using escape sequence
        // characters.
        // Letter = “Dear Devendra, This Programs is nice. Thanks”
        System.out.println("\"Dear Devendra, \nThis Programs is nice. \nThanks\"");

        sc.close();
    }
}