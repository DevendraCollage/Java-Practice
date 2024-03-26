/*
 * You have to create a package named com.dev.shape.
 * This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere.
 * These classes should use inheritance to properly manage the code!
 * Include methods like volume, surface area and getters and setters for dimensions.
 */

import com.dev.shape.*; // Now After The Compilation we can use the all the method of the package

class Rectangle {
    public void volume() {
        System.out.println("This is a Rectangle class and this is a volume method!");
    }

    public void surface() {
        System.out.println("This is a surface method of the Rectangle class!");
    }

}

class Square extends Rectangle {
    public void volume() {
        System.out.println("This is a Square class and this is a volume method!");
    }

    public void surface() {
        System.out.println("This is a surface method of the Square class!");
    }
}

class Circle extends Square {
    public void volume() {
        System.out.println("This is a Circle class and this is a volume method!");
    }

    public void surface() {
        System.out.println("This is a surface method of the Circle class!");
    }
}

class Cylinder extends Circle {
    public void volume() {
        System.out.println("This is a Cylinder class and this is a volume method!");
    }

    public void surface() {
        System.out.println("This is a surface method of the Cylinder class!");
    }
}

class Sphere extends Cylinder {
    public void volume() {
        System.out.println("This is a Sphere class and this is a volume method!");
    }

    public void surface() {
        System.out.println("This is a surface method of the Sphere class!");
    }
}

public class Exercise_5 {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.volume();
        s.surface();
    }
}