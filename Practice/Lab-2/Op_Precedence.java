//* Demonstrate the Operator precedence.

public class Op_Precedence {
    public static void main(String[] args) {
        //? a. 10 + 20 * 30
        int a = 10 + 20 * 30; // Output: 610
        System.out.println(a);

        //? b. 100 / 10 * 100
        int b = 100 / 10 * 100; // Output: 1000
        System.out.println(b);

        //? c. 5 * 4 / 4 % 3
        int c = 5 * 4 / 4 % 3; // Output: 2
        System.out.println(c);

        //? d. 100 + 200 / 10 – 3 * 10
        int d = 100 + 200 / 10 - 3 * 10; // Output: 90
        System.out.println(d);
    }    
}
