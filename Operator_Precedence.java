
public class Operator_Precedence {
    public static void main(String[] args) {
        // ? Precedence and Associativity
        int a1 = 6 * 5 + 8 / 2 - 4;
        // ? Precedence means the order in which operators are processed.
        /*
         * Associativity means whether an operator applies to operands with same
         * precedence from left or right or right to left.
         */
        System.out.println(a1);
        // ? Output
        /*
         * = 6 * 5 + 8 / 2 - 4
         * = 30 + 4 - 4
         * = 34 - 4
         * = 30
         */

        // * Quick-Quiz
        int x = 5;
        int y = 6;
        // ? 1.
        int z = x - y / 2;
        System.out.println("x - y/2 : " + z);
        /*
         * Output
         * = x - y /2
         * = 5 - 6 / 2
         * = 5 - 3
         * = 2
         */

        // ? 2.
        int a2 = 2;
        int b = 4;
        int c = 6;

        int d = b * b - 4 * a2 * c / 2 * a2;
        System.out.println(d);

        /*
         * Output
         * = b * b - 4 * a * c / 2 * a
         * = 4 * 4 - 4 * 2 * 6 / 2 * 2
         * = 16 - 48
         * = -32
         */

        // ? 3.
        int v = 5;
        int u = 7;
        int w = v * v - u * u;
        System.out.println(w);

        /*
         * Output
         * = 5 * 5 - 7 * 7
         * = 25 - 49
         * = -24
         */

        // ? 3.
        int a = 5;
        int b2 = 4;
        int d2 = 8;
        int c2 = a * b2 - d2;
        System.out.println(c2);
        /*
         * Output
         * = a * b - d
         * = 5 * 4 - 8
         * = 20 - 8
         * = 12
         */
    }
}