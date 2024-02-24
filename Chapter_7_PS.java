
//* Practice Set of Chapter-1 of Java
import java.util.Scanner; //? This for reading input from the user

public class Chapter_7_PS {
    // ! 1. Write a Java method to print the multiplication table of a number n.
    // ? Method to print multiplication table of n
    int mulTable(int n) {
        System.out.println("-- Multiplication Table --");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
        return n;
    }

    // ! 2. Write a program using functions to print the following pattern:
    /*
     *
     **
     ***
     ****
     *****
     */
    int printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }

    // ! 3. Write a recursive function to calculate the sum of first n natural
    // numbers.
    int sumNaturalNumRec(int n) {
        int sum = 0;
        // Base condition
        if (n == 0 || n == 1) {
            return n;
        }
        sum = n + sumNaturalNumRec(n - 1);
        return sum;
    }

    // ! 4. Write a function to print the following pattern:
    /*
     ****
     ***
     **
     *
     */
    int printPatternReverse(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }

    // ! 5. Write a function to print the nth term of the Fibonacci series using
    // recursion.
    int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    // ! 6. Write a function to find the average of a set of numbers passed as
    // arguments.
    int avgNum(int n) {
        int sum = 0;
        int avg = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        avg = sum / n;
        return avg;
    }

    // ! 7. Repeat problem 4 using Recursion.
    int printPatternReverseFirst(int n) {
        if (n > 0) {
            printPatternReverse(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }

    // ! 8. Repeat problem 2 using Recursion.
    int printPatternFirst(int n) {
        if (n > 0) {
            printPattern(n - 1);
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }

    // ! 9. Write a function to convert Celsius temperature into Fahrenheit.
    double convertTemp(float n) {
        float Celsius = n;
        // Convert celsius to fahrenheit temperature
        float fahrenheit = (Celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    // ! 10. Repeat problem 3 using an iterative approach.
    int sumNaturalNum(int n) {
        int sum = 0;
        if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.printf("The sum of first %d natural number is : %d", n, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);
        Chapter_7_PS c7 = new Chapter_7_PS();

        // * Call the multiplication method and pass an integer as argument
        c7.mulTable(5);

        // * Call the printPattern method and pass an integer as argument
        c7.printPattern(5);

        // * Call the sumNaturalNum method and pass an integer as argument
        System.out.printf("The sum of first %d natural number is : %d", 10, c7.sumNaturalNumRec(10));

        // * Call the printPatternReverse method and pass an integer as argument
        c7.printPatternReverse(5);

        // * Call the Fibonacci method and pass an integer as argument
        int result = c7.Fibonacci(7);
        System.out.println(result);

        // * Call the avgNum method and pass an integer as argument
        int num = 5;
        System.out.printf("The average of first %d number is : %d", num,
                c7.avgNum(5));

        // * Call the printPatternReverse method and pass an integer as argument
        c7.printPatternReverse(5);

        // * Call the printPattern method and pass an integer as argument
        c7.printPattern(5);

        // * Call the convertTemp method and pass an temperature as argument
        System.out.println(c7.convertTemp(75));

        // * Call the sumNaturalNum method and pass an integer as argument
        c7.sumNaturalNum(5);

        sc.close();
    }
}
