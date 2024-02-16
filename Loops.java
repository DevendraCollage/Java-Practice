import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ! In java there are three type of loop:
        /*
         * 1. While
         * 2. do-While
         * 3. For
         */

        // ? 1. While loop demo to print 1-10
        // todo: This loop is use if you have not specified number of iteration
        System.out.println("Print number using while loop");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        // ? 2. do-While loop demo to print 1-10
        // todo: This loop will executes at least one if condition true or false, then
        // todo: it checks again the condition
        System.out.println("Print number using do-while loop");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);
        System.out.println();

        // ? 3. for loop demo to print 1-10
        // todo: For loop use for defined condition
        System.out.println("Print number using for loop");
        for (int j2 = 1; j2 <= 10; j2++) {
            System.out.println(j2);
        }

        sc.close();
    }
}
