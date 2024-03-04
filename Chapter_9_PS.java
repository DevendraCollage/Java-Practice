//? 1. This class for Question-1
class Cylinder {
    private int radius;
    private int height;

    // ? Constructor to implement this concept
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // ? Getter method to get radius
    public int getRadius() {
        return radius;
    }

    // ? Getter method to get height
    public int getHeight() {
        return height;
    }

    // ? Setter method to set radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // ? Setter method to set height
    public void setHeight(int height) {
        this.height = height;
    }
}

// ? 2. This class for Question-2
class CalculateSurface {

    // ? Finalize using Constructor
    // ? This constructor implementation is for question-3
    public CalculateSurface() {
        final double PI = 3.1416;
        int radius = 5;
        int height = 5;
        double surfaceArea = PI * 2 * radius * height;
        double volume = PI * radius * radius * height;
        System.out.println(surfaceArea);
        System.out.println(volume);
    }

    // ! This method of the code for the question for two
    // public double getSurfaceArea() {
    // return surfaceArea;
    // }

    // public double getVolume() {
    // return volume;
    // }
}

public class Chapter_9_PS {
    public static void main(String[] args) {
        // * Question-1
        // Cylinder c = new Cylinder();
        // c.setHeight(5);
        // c.setRadius(4);
        // System.out.println(c.getHeight());
        // System.out.println(c.getRadius());

        // * Question-2
        // CalculateSurface c1 = new CalculateSurface();
        // System.out.println("The surface of Cylinder is : " + c1.getSurfaceArea());
        // System.out.println("The volume of Cylinder is : " + c1.getVolume());

        // * Question-3
        // CalculateSurface c1 = new CalculateSurface();

        // * Question-4
    }
}
