import mycustompackage.*; // Import the package of UDF Package

//! Access Modifier Accessibility
//?             within     within      outside package     outside     
//?             class      package     by subclass         package
//* public        Y           Y            Y                   Y
//* protected     Y           Y            Y                   N
//* Default       Y           Y            N                   N
//* private       Y           N            N                   N

class Ex1 {
    public int num1 = 10; // (Public Access Modifiers)
    private int num2 = 20; // (Private Access Modifiers)
    protected int num3 = 30; // (Protected Access Modifiers)
    int num4 = 40; // (Default Access Modifiers)

    public void sum() {
        // We can access all the property of the class
        System.out.println("Access the property using method!");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }

    // ! Withing subclass we can only access public and private access modifiers but
    // cannot protected and default
}

public class AccessModifiers {
    public static void main(String[] args) {
        // ? Create instance of th Ex1 Class
        Ex1 ex = new Ex1();
        ex.sum();

        // ? We access the property of the class
        System.out.println();
        System.out.println("Access the property within package!");
        System.out.println(ex.num1);
        // Here you can see that we can not access private access modifiers in the same
        // package
        // System.out.println(ex.num2);
        System.out.println(ex.num3);
        System.out.println(ex.num4);
    }
}
