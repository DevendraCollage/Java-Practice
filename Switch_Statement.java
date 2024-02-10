import java.util.*;

public class Switch_Statement {
    public static void main(String[] args) {
        // ? Scanner class object to get the input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Week Day : ");
        int weekDay = sc.nextInt();

        switch (weekDay) {
            case 1:
                System.out.println("Sunday");
                break; // ? The break statement break the condition from this and will not check
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter Valid Week Day!");
        }
        System.out.println("Thanks for using my java code!");

        sc.close();
    }
}