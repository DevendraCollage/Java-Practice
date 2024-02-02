//* Introduction to Java Operators

public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        // ! 1. Arithmetic operators
        // ? Arithmetic operators are used to perform mathematical operations such as
        // addition, subtraction, multiplication, division, etc.
        System.out.println(a + b); // * 12
        System.out.println(a - b); // * 8
        System.out.println(a * b);// * 20
        System.out.println(a / b); // * 5
        System.out.println(a % b); // * remainder of the division (10/2=5), so it is 0

        // ! 2. Comparison operators
        // ? As the name suggests, these operators are used to compare two operands
        System.out.println(a == b);// * false
        System.out.println(a != b); // * true
        System.out.println(a > b); // * true
        System.out.println(a < b); // * false
        System.out.println(a >= b); // * true
        System.out.println(a <= b); // * false

        // ! 3. Logical operators
        // ? These operators determine the logic in an expression containing two or more
        // values of variable
        System.out.println(a == b && b == a); // * false
        System.out.println(a == b || b == a); // * true

        // ! 4. Bitwise operators
        // ? Bitwise operators perform the operations on every bit of a number
        System.out.println(a & b); // * 2
        System.out.println(a | b); // * 10
        System.out.println(a ^ b); // * 8

        // ! 5. Assignment operators
        int c = 10;
        c += 5; // * c is now 15
        c -= 5; // * c is now 10
        c *= 5; // * c is now 50
        c /= 5; // * c is now 10
        System.out.println(c);
    }
}
