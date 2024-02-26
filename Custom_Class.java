class Employee {
    int id;
    String name;

    // ? Define printf method to print details
    public void printDetails() {
        System.out.println(id);
        System.out.println(name);
    }
}

public class Custom_Class {
    public static void main(String[] args) {
        // ? Create instance of the Employee class
        Employee emp = new Employee();

        // ? Print the value of the Employee class Attributes
        // System.out.println(emp.name = "Devendra");
        // System.out.println(emp.id = 1001);

        // ? Setting value of the attributes
        emp.id = 1001;
        emp.name = "Devendra";

        // ? Call the method from the Employee Class
        emp.printDetails();
    }
}