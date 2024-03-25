// package folder.folder1.folder2;// This is for question-3

// package calc; // This is for question-2

class Calculator {
    public void add(int num1, int num2) {
        System.out.printf("%d + %d = %d\n", num1, num1, (num1 + num2));
    }

    protected String num1 = "Hello i am protected in subclass";
    String num2 = "Hello i am a default";
}

class scCalculator {
    public void calculate(int num1, int num2) {
        System.out.printf("%d + %d = %d\n", num1, num1, (num1 + num2));
    }
}

class hyCalculator {
    public void calculateAnother(int num1, int num2) {
        System.out.printf("%d + %d = %d\n", num1, num1, (num1 + num2));
    }
}

public class Chapter_12_PS {
    public static void main(String[] args) {
        System.out.println("I am an main method!");
    }

    protected String num1 = "Hello i am protected in subclass"; // This will be protected will be accessed
    String num2 = "Hello i am a default"; // This is a default we cannot access from the subclass
}
