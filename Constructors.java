class Employee {
    private int Salary;
    private String name;

    public Employee() { // ? This is default constructor
        System.out.println("This is default constructor!");
    }

    // * Constructor - method with same name as class (we can also overload the
    // constructor)
    // * Method overloading means same name with different parameters
    public Employee(int Salary) { // ? This is parameterized constructor
        this.Salary = Salary;
        name = "Devendra";
    }

    public Employee(int Salary, String name) { // ? This is parameterized constructor but with method overloading
        this.Salary = Salary;
        this.name = name;
    }

    // * This is simple methods
    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructors {
    public static void main(String[] args) {
        // ? Create instance of th Employee class
        Employee e0 = new Employee();
        Employee e1 = new Employee(15400);
        Employee e2 = new Employee(10000, "Devendra");

        System.out.println(e2.getSalary());
        System.out.println(e2.getName());

        // If we not pass the value then this will get the constructor value
        // Constructor call when the object the class is initialized automatically

        System.out.println(e1.getName());
        System.out.println(e1.getSalary());
    }
}
