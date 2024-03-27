//* Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 );

import java.util.*;

public class ConvertTemp {
    public static void main(String[] args) {
        // Create the instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Get the temperature from the user
        System.out.print("Enter the temperature here : ");
        float temp = sc.nextFloat();

        // Convert the temperature from fahrenheit to celsius
        float celsius = (temp - 32) * 5 / 9;

        // Print the converted temperature
        System.out.println("The temperature in celsius is : " + celsius);

        sc.close();
    }
}
