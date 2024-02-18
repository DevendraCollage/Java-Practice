import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ? There are three ways to declare array in Java

        // ! 1. Declaration and then memory allocation
        int[] marks;
        marks = new int[5]; // Declare and initialize an integer array with size 5
        marks[0] = 92; // Assign values to each element
        System.out.println("Marks at index 0 : " + marks[0]);

        // ! 2. Declaration and memory allocation
        int[] subject = new int[5];
        subject[0] = 10;
        subject[1] = 20;
        subject[2] = 30;
        System.out.println(subject[2]);

        // ! 3. Dynamically size will be get by the java
        int[] student = { 10, 20, 30 }; // Directly declaring and initializing an array
        System.out.println(student[1]);

        sc.close();
    }
}
