import java.util.*;
//! Write a java program to print the array in reverse order

public class Quick_Quiz4 {
    public static void main(String[] args) {
        // ? Create object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // ? Get the length of the array from the user
        System.out.print("Enter the length of the array : ");
        int arrlen = sc.nextInt();

        // ? Declare an one array and initialize user size
        int arr[] = new int[arrlen];

        // ? Get the elements of the array from the user
        for (int i = 0; i < arrlen; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // ? Print the array elements in the reverse order
        System.out.println("-- Printing array elements in reverse order --");
        for (int i = arrlen - 1; i >= 0; i--) {
            System.out.printf("[%d] : %d\n", i, arr[i]);
        }

        sc.close();
    }
}
