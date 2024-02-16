import java.util.*;
// todo: Write java program to print natural numbers from 100 to 200.

public class Quick_Quiz {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("-- Print natural number from 100 to 200 --");
        for (int i = 100; i <= 200; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
