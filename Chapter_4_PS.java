
//* Practice Set of Chapter-4 of Java
import java.util.*;

public class Chapter_4_PS {
    public static void main(String[] args) {
        // ? Create object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // ! Problem:1 What will be the output of this program:
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I an not 11");
        }
        // * Output: I am not 11

        // ! Problem:2 Write a program to find out whether a student is pass or fail; if
        // ! it requires a total of 40% and at least 33% in each subject to pass. Assume
        // 3
        // ! subjects and take marks as input from the user.
        // ? Get marks from the users of three subjects
        System.out.print("Enter The Subject 1 Marks : ");
        int sub1 = sc.nextInt();
        System.out.print("Enter The Subject 2 Marks : ");
        int sub2 = sc.nextInt();
        System.out.print("Enter The Subject 3 Marks : ");
        int sub3 = sc.nextInt();

        // ? Calculate average marks of the three subject
        float average = (sub1 + sub2 + sub3) / 3;
        System.out.printf("You got average marks in all subject is : %.2f\n",
                average);

        // ? Check overall marks if grater 40 or not
        if (average >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("Congratulations! You are passed");
        } else {
            System.out.println("Try again next, you are Fail?");
        }

        // ! Problem:3 Question 3 :Calculate income tax paid by an employee to the
        // ! government as per the slabs mentioned below:
        // ! Income Slab Tax
        // ! 2.5L – 5.0L 5%
        // ! 5.0L – 10.0L 20%
        // ! Above 10.0L 30%
        // ! Note that there is not tax below 2.5L. Take the input amount as input from
        // ! the user.
        // ? Get the income from the user
        System.out.print("Enter your income here in lakhs : ");
        int income = sc.nextInt();

        // ? Check the income accordingly to the slab
        if (income < 250000) {
            System.out.println("You want to paid 0% income tax!");
        } else if (income >= 250000 && income <= 500000) {
            System.out.println("You want to pay 5% income tax!");
        } else if (income >= 500000 && income <= 100000) {
            System.out.println("You want to pay 20% income tax!");
        } else {
            System.out.println("You want to pay 30% income tax!");
        }

        // ! Problem:4 Write a Java program to find out the day of the week given the
        // ! number [1 for Monday, 2 for Tuesday … and so on!]
        // do {
        // // ? Get the week day from the user
        // System.out.print("Enter the week day here : ");
        // int weekDay = sc.nextInt();

        // // ? Check the week day accordingly
        // if (weekDay == 1) {
        // System.out.println("Sunday!");
        // } else if (weekDay == 2) {
        // System.out.println("Monday!");
        // } else if (weekDay == 3) {
        // System.out.println("Tuesday!");
        // } else if (weekDay == 4) {
        // System.out.println("Wednesday!");
        // } else if (weekDay == 5) {
        // System.out.println("Thursday!");
        // } else if (weekDay == 6) {
        // System.out.println("Friday!");
        // } else if (weekDay == 7) {
        // System.out.println("Saturday!");
        // } else {
        // System.out.println("Enter valid week day?");
        // }
        // } while (true);

        // ! Problem:5 Write a Java program to find whether a year entered by the user
        // ! is a leap year or not.
        // ? Get the year from the user
        System.out.println("Enter the year here : ");
        int year = sc.nextInt();

        // ? Check if the year is leap or not
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.printf("%d is leap year!", year);
        } else {
            System.out.printf("%d is not a leap year!", year);
        }

        // ! Problem:6 Write a program to find out the type of website from the URL:
        // ! .com – commercial website
        // ! .org – organization website
        // ! .in – Indian website
        // ? Get the Website from the url
        System.out.print("Enter the website URL : ");
        String url = sc.nextLine();

        // ? Check the url is Indian website or Commercial website or Organizational
        // website
        if (url.endsWith(".com")) {
            System.out.println("This is commercial website!");
        } else if (url.endsWith(".org")) {
            System.out.println("This is organizational website!");
        } else {
            System.out.println("This is Indian website!");
        }

        sc.close();
    }
}
