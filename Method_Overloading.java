// todo: Method overloading - Same name, different parameters

public class Method_Overloading {
    // ? void method that will not return anything
    // ? Static means we want not to make object to access the method - without
    // class object we can access the method
    // ? Method overloading means same name with different parameters
    static void tellJoke() {
        System.out.println("Hello, How are you!");
    }

    static void tellJoke(int a) {
        System.out.println("Hello, how are you! You passed " + a);
    }

    public static void main(String[] args) {
        // ? Call the tellJoke method
        tellJoke(); // This will call method 1
        tellJoke(10); // This will call method 2
    }
}
