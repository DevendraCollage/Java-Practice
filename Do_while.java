import java.util.*;

public class Do_while {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ? 2. do-While loop demo to print 1-10
        // todo: This loop will executes at least one if condition true or false, then
        // todo: it checks again the condition
        System.out.println("Print number using do-while loop");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        sc.close();
    }
}
