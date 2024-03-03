
//* Create a simple Rock, Paper Scissors game in Java. (#Using Conditional Statements)
import java.util.*;;

public class Exercise_2 {
    public static void main(String[] args) {
        // ? Create object of the Scanner class
        Scanner sc = new Scanner(System.in);

        // ? Generate random number between 0 to 2 (Means between 1 to 3)
        Random random = new Random();
        int computerRandomNumber = random.nextInt(3);
        // ! For computer 0=Stone, 1=Paper, 2=Scissors

        // ? Get the choice from the user
        System.out.println("----- Welcome to the game Stone, Paper, Scissors -----");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissors");
        System.out.println("3 - Stone");

        // ? Match the condition of the user and computer
        do {
            System.out.print("Enter Your Choice Here From The Above or enter exit to exit from this : ");
            int userChoice = sc.nextInt();
            if (computerRandomNumber == 0 && userChoice == 1 || computerRandomNumber == 1 && userChoice == 2
                    || computerRandomNumber == 2 && userChoice == 3) {
                System.out.println("\nCongratulations! You Win!");
            } else if (computerRandomNumber == 0 && userChoice == 2) {
                System.out.println("\nComputer Wins This Time.");
                System.out.println("The computer choice is : " + computerRandomNumber); // * This will print computer choice
            } else if (userChoice == computerRandomNumber) {
                System.out.println("\nIt's a Draw!");
            } else {
                System.out.println("\nYou Lose! Computer Wins!");
            }
        } while (true);
    }
}
