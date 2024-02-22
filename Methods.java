import java.util.*;
// todo: Making the function and separate the logic of the programs

public class Methods {

    // ? Create function of the to check the which number is greater
    // ? From the static method you can only call the static method
    static int check(int x, int y) { // This is function parameters
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        // ? Create scanner class object to get the input from the user
        Scanner sc = new Scanner(System.in);

        // ? Create the object of the class and call the method
        Methods m = new Methods();

        int a = 2;
        int b = 4;
        // System.out.println(check(a, b)); // Output: 30 // This is function arguments
        System.out.println(m.check(a, b)); // This another type to call the method using class name object

        int c = 14;
        int d = 6;
        // System.out.println(check(c, d)); // Output: 20 // This is function arguments
        System.out.println(m.check(c, d)); // This another type to call the method using class name object

        sc.close();
    }
}
