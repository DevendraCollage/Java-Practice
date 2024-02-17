import java.util.*;

public class For_loop {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ? Print number from 1 to 10 using incrementing for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        // ? Print number from 10 to 1 using decrementing for loop
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
