//* Three types of importing a java packages

//? Import all the packages (and crete and the reference)
// import java.util.*;
//? Import One of the class of the packages (and crete and the reference)
import java.util.Scanner;

public class Packages {
    public static void main(String[] args) {
        // ? And use one of them
        Scanner sc = new Scanner(System.in);
        System.out.println("This is my Scanner Class!");
        sc.close();

        // ? And also use this without importing
        java.util.Scanner sc2 = new java.util.Scanner(System.in);
        System.out.println("This is my type of the importing scanner class");
        sc2.close();
    }
}
