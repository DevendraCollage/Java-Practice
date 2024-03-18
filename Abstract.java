//* Abstract Class Demo (What is the use of the Abstract to use to define the standard)
//* From Abstract we can achieve Security or Abstraction (Hides certain details from the user)

abstract class Parent {
    Parent() {
        System.out.println("I am an constructor! of the Base Class");
    }

    public void sayHello() {
        System.out.println("Hello, world");
    }

    abstract public void greet();
}

// ! We cannot implement class without method and inheritance this will give an
// error but you can have an option to create class as a abstract or implement
// the method of the class

abstract class ChildAnother extends Parent {
    public void heelo() {
        System.out.println("Hello, ChildAnother");
    }
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Hello, Child");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        c.sayHello();
    }
}
