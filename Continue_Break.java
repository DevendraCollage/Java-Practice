import java.util.*;

public class Continue_Break {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // * Break and Continue using for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) { // ? If this condition will match then this will break loop from this
                System.out.println("Break Loop from this!");
                break;
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) {
                System.out.println("Break Loop from this!");
                continue; // ? But if we use "continue" instead of "break", it will skip current iteration
            }
            System.out.println("Out of loop");
        }

        sc.close();
    }
}
