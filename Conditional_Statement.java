import java.util.*;

public class Conditional_Statement {
    public static void main(String[] args) {
        // ? Create object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // ? Get the age from the user
        System.out.print("Enter your age here : ");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You can not drive yet?");
        } else {
            System.out.println("Yes you can drive!");
        }

        sc.close();
    }
}
