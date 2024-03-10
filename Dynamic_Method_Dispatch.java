//? Dynamic Method Dispatch also known as "run time polymorphism" or simply "polymorphism".
//: ### Definition ###
//: Dynamic method dispatch is a mechanism that allows objects of different classes to respond to the same dynamic method

class Parent {
    public void greet() {
        System.out.println("Hello World from Java!");
    }

    public void name() {
        System.out.println("My Name is Parent from Class One!");
    }
}

class Child extends Parent {
    public void welcome() {
        System.out.println("Welcome to the world of Java!");
    }

    public void name() {
        System.out.println("My Name is Child from Class Two!");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Parent parent1 = new Parent(); // This is valid
        parent1.greet(); // This will access the parent class methods
        parent1.name(); // This will also access the parent class methods

        Child child = new Child(); // This is also valid
        child.welcome(); // This will access the child class method, not the parent's
        // one!
        child.name(); // This will access the child class method, not the parent's
        // one! (Because this
        // method is override)

        // Child child = new Parent(); // This is invalid because we can’t create an
        // object
        // of the super class and assign it to a reference of the super class

        Parent parent = new Child(); // This is valid because we can create an object
        // of the Parent class and refer
        // to the child class
        parent.greet();
        parent.name();
    }
}