class Demo {
    int ab;

    public int getOne() {
        return ab;
    }

    Demo(int ab) {
        this.ab = ab; // ? this will be a reference to a object
    }

    public int GaveOne() {
        return 1;
    }
}

class AnotherDemo extends Demo {
    AnotherDemo(int c) {
        super(c); // ? super will reference variable to refer to the immediate super class
                  // constructor
        System.out.println("I am an constructor!");
    }
}

public class This_Super {
    public static void main(String[] args) {
        // Demo d = new Demo(95);
        AnotherDemo an = new AnotherDemo(52);
        System.out.println(an.getOne()); // Output: 52
        System.out.println(an.GaveOne()); // Output: 1
    }
}