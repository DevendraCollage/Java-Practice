class Base {

    Base() { // This is simple constructor
        System.out.println("I am an constructor!");
    }

    Base(int a) { // This is overloaded constructor
        System.out.println("I am an overloaded constructor with value of a is : " + a);
    }

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Another extends Base {

    Another() { // This is child class constructor
        super(15); // calling the base class constructor by using value 15
        System.out.println("I am another child class constructor!");
    }

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class ConstructorsWithInheritance {
    public static void main(String[] args) {
        // Base b = new Base();
        Another d = new Another();
    }
}
