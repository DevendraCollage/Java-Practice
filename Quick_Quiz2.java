import java.util.*;
// todo: Write a program to print first n natural numbers using do-while loop

public class Quick_Quiz2 {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ? Get the n natural number from the user
        System.out.print("Enter the number you want to print : ");
        int userNum = sc.nextInt();

        // ? Print the number using do-while loop
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= userNum);

        sc.close();
    }
}
