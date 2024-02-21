//* Practice Set of Chapter-6 of Java

import java.util.*;

public class Chapter_6_PS {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // ! 1. Create an array of 5 floats and calculate their sum.
        float[] arrFloat = new float[5];
        arrFloat[0] = 10.5f;
        arrFloat[1] = 20.8f;
        arrFloat[2] = 39.4f;
        arrFloat[3] = 5.5f;
        arrFloat[4] = 12.7f;

        // ? Create sum variable and store the sum of the array in that
        float sum = 0;

        // ? Calculate the sum of the array elements
        for (int i = 0; i < arrFloat.length; i++) {
            sum = sum + arrFloat[i];
        }

        // ? Print the result on the screen
        System.out.println("The sum of all the array elements will be : " + sum);

        // ! 2. Write a program to find out whether a given integer is present in an
        // array or not.

        // ? Create an array of integer
        int[] tempArr = { 10, 20, 50, 80, 152, 201 };

        // ? Find the integer will be in the array or not
        int index = 0;
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 80) {
                index = i;
                break;
            }
        }

        // ? Print the index of the element will available in the array
        System.out.println("The number 80 is at index: " + index);

        // ! 3. Calculate the average marks from an array containing marks of all
        // students in physics using a for-each loop.

        // ? Create array of marks of student
        int[] marks = { 55, 85, 65, 74, 46 };

        // ? Calculate the total of the marks
        int sum1 = 0;
        for (int element : marks) {
            sum1 = sum1 + element;
        }

        // ? Calculate the average of the marks
        double avgMarks = sum1 / marks.length;

        // ? Print the result
        System.out.println("The average mark is : " + avgMarks);

        // ! 4. Create a Java program to add two matrices of size 2x3.

        // ? Create the two matrices of size 2x3
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];

        // ? Get the elements of the array 1st from the user
        System.out.println("Enter the elements of the first array : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // ? Get the elements of the array 2nd from the user
        System.out.println("Enter the elements of the second array : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // ? Create the sum array to sum of the two array
        int[][] sumMatrix = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = a[i][j] + b[i][j];
            }
        }

        // ? Print the sum of the matrix
        System.out.println("\nSum of the two arrays : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        // ! 5. Write a Java program to reverse an array.

        // ? Declare an array
        int[] demoArray = { 10, 20, 30, 40, 50 };

        // ? Print the array
        System.out.println("Print the array elements : ");
        for (int i = 0; i < demoArray.length; i++) {
            System.out.println(demoArray[i]);
        }

        // ? Print the array in reverse order
        System.out.println("Print the array elements in reverse order : ");
        for (int i = demoArray.length - 1; i >= 0; i--) {
            System.out.println(demoArray[i]);
        }

        // ! 6. Write a Java program to find the maximum element in an array.

        // ? Declare an array
        int[] maxElement = { 10, 25, 54, 84, 65 };

        // ? Declare one variable
        int max = maxElement[0];

        // ? Find the max element using loop
        for (int i = 0; i < maxElement.length; i++) {
            if (maxElement[i] > max) {
                max = maxElement[i];
            }
        }

        // ? Print the max element of the array
        System.out.println("The largest element of the array : " + max);

        // ! 7. This question sam as question-6

        // ! 8. Write a Java program to find whether an array is sorted or not.

        // ? Declare array
        int[] arr = { 10, 20, 25, 36 };

        boolean isSorted = false;

        // ? Check the array is sorted or not
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }

        // ? Print the result
        if (isSorted == false) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

        sc.close();
    }
}
