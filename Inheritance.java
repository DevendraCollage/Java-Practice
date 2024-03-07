//* Explanation of the Inheritance

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    void Prime() {
        System.out.println("I am am method!");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();

        // ? Setting the attributes
        b.setX(10);
        System.out.println(b.getX()); // Output: 10

        // ! This way we can not set the attributes
        // b.setY(50);
        // System.out.println(b.setY());

        Derived d = new Derived();

        // ? setting the attributes
        d.setX(10);
        System.out.println(d.getX()); // Output: 10

        d.setY(20);
        System.out.println(d.getY()); // Output: 20

    }
}