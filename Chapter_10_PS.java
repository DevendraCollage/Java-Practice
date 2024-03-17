//* This class is for Question-1
class Circle {
    double radius; // Properties of class

    Circle(double r) { // This Constructor set the radius of the circle
        this.radius = r;
    }

    // ! This method is implemented in question-3
    public double area() { // Function of the class Circle return area of the circle
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {
    int height; // Properties of class

    Cylinder(double radius, int height) {
        super(radius);
        this.height = height;
    }

    // ! This method is implemented in question-3
    public double volume() { // Function of the class Cylinder return volume of the Cylinder
        return Math.PI * radius * radius * height;
    }
}

// * This class for Question-2
class Rectangle {
    double length;
    double width;

    // ! This is for question-4
    public void getter(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double area() {
        return length * width;
    }

    // ! This is for Question-2
    // public Rectangle(double l, double w) {
    // this.length = l;
    // this.width = w;
    // }

    // public double area() {
    // return length * width;
    // }
}

class Cuboid extends Rectangle {
    int height;

    // ! This is for question-4
    public void getter(double l, double w, int h) {
        super.getter(l, w);
        this.height = h;
    }

    public double volume() {
        return length * width * height;
    }

    // ! This for question-2
    // public Cuboid(double l, double w, int h) {
    // super(l, w);
    // this.height = h;
    // }

    // public double volume() {
    // return length * width * height;
    // }
}

public class Chapter_10_PS {
    public static void main(String[] args) {
        // ? Question:1
        // Cylinder c = new Cylinder(5.7, 12);
        // System.out.println("Cylinder volume : " + c.volume()); // This will call
        // Cylinder method
        // System.out.println("Circle Area : " + c.area()); // This will call Circle
        // method

        // ? Question-2
        // Cuboid c = new Cuboid(2.5, 4.23, 5);
        // System.out.println("Cuboid volume : " + c.volume()); // This will call Volume
        // method of Cuboid
        // System.out.println("Rectangle Area : " + c.area()); // This will call Area
        // method of Rectangle

        // ? Question-3
        // Implement Volume and Area methods in Question-1 (This is done in a
        // question-1)

        // ? Question-4
        // Cuboid c = new Cuboid();
        // c.getter(2.5, 4.23, 5);
        // System.out.println("Cuboid volume : " + c.volume()); // This will call Volume
        // method of Cuboid
        // System.out.println("Rectangle Area : " + c.area()); // This will call Area
        // method of Rectangle
    }
}
