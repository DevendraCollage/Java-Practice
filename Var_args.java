//* Introduction to Variable arguments (var args)

public class Var_args {
    static int sumNum(int... arr) {
        int result = 0;
        for (int i : arr) {
            result = result + i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("This is an Var Args");

        // Call the function of var args
        System.out.println(sumNum(1, 2));
        System.out.println(sumNum(1, 2, 3, 4));
    }
}
