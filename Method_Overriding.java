class A {
    public String myName() {
        return "Devendra";
    }

    public void Method2() {
        System.out.println("I am a method of the class A");
    }
}

class B extends A {
    @Override // This is the notation to describe this is an implementation of the override
              // method
    public void Method2() { // This is the concept of the method overriding with super class
        System.out.println("I am a method of the class B");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // Accessing the method of the class
        a.Method2();
        b.Method2();
    }
}
