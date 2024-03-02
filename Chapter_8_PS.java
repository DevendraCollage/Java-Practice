//* Practice Set of Chapter-8 of Java

import java.util.*;

//! This class for question-1
class Employee {
    int Salary;
    String name;

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// ! This class for question-2
class Cellphone {
    public void ringing() {
        System.out.println("Ringing");
    }

    public void vibrating() {
        System.out.println("Vibrating");
    }
}

// ! This class for question-3
class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

// ! This class for question-4
class Rectangle {
    int height, width;

    public int area() {
        return height * width;
    }

    public int perimeter() {
        return 4 * height + width;
    }
}

// ! This class for question-5
class TommyVecetti {
    public void hitting() {
        System.out.println("Hitting!");
    }

    public void running() {
        System.out.println("Running!");
    }

    public void firing() {
        System.out.println("Firing!");
    }
}

// ! This class for question-6
class Circle {
    int radius;

    public double area() {
        return 3.1416 * radius * radius;
    }

    public double perimeter() {
        return 2 * radius * 3.1416;
    }
}

public class Chapter_8_PS {
    public static void main(String[] args) {
        // ? Create object of the scanner class
        Scanner sc = new Scanner(System.in);

        // * Question-1
        Employee e1 = new Employee();
        e1.setName("Devendra"); // ? With setName method set the name of the employee
        e1.Salary = 15200;
        System.out.println("Employee name : " + e1.name);
        System.out.println("Employee Salary : " + e1.Salary);

        // * Question-2
        Cellphone c1 = new Cellphone();
        c1.ringing();
        c1.vibrating();

        // * Question-3
        Square s1 = new Square();
        s1.side = 6;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());

        // * Question-4
        Rectangle r1 = new Rectangle();
        r1.height = 6;
        r1.width = 8;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        // * Question-5
        TommyVecetti t = new TommyVecetti();
        t.hitting();
        t.running();
        t.firing();

        // * Question-6
        Circle c = new Circle();
        c.radius = 9;
        System.out.println(c.area());
        System.out.println(c.perimeter());

        sc.close();
    }
}