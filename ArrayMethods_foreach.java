import java.util.*;

public class ArrayMethods_foreach {
    public static void main(String[] args) {
        // ? Create object of the Scanner class
        Scanner sc = new Scanner(System.in);

        int[] marks = { 10, 20, 50, 88, 99 };
        System.out.println(marks[1]); // Output: 20 //? This will will print the index element
        System.out.println(marks.length); // Output: 5 //? This will give the length of the array

        // ? Display the array using loop
        System.out.println("Print the array elements using array!");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // ? Display the array using for-each loop
        for (int element : marks) {
            System.out.println(element);
        }

        sc.close();
    }
}
