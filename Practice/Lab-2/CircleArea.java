//* Write a program to calculate the area of circle.

import java.util.*;

public class CircleArea {
    public static void main(String[] args) { 
        // Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Get the radius from the user
        System.out.print("Enter the radius of the circle : ");
        float radius = sc.nextFloat();

        // Calculate the area of the Circle
        float area = (float) Math.PI * radius * radius;

        // Print the area of the Circle
        System.out.println("The area of the circle is : " + area);

        sc.close();
    }
}
