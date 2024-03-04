import java.util.*;
/*
 * Create a class Game, which allows a use to play "Guess the number game once. Game should have the following methods:"
 * 1. Create Constructor to generate the random number
 * 2. takeUserInput() function to take a user input of number from the user
 * 3. isCorrectNumber() function to detect whether the number entered by the user is true 
 * 4. getter and setter method for noOfGuesses.
 * -> use properties such as noOfGuesses(int), etc to get this task done!
 */

//? Create a class Game
class Game {
    // * Declare variable such as noOfGuesses(int) and guessByUser(int)
    int noOfGuesses = 10;
    int guessByUser = 0;

    Random random = new Random();
    int computerRandomNumber;

    // * 1. Create Constructor to generate random number
    public Game() {
        // ? generate random number between 1 to 100
        computerRandomNumber = random.nextInt(100);
    }

    // * 2. Create function to get the number from the user
    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here to guess the number : ");
        int userNumber = sc.nextInt();
        return userNumber;
    }

    // * 3. Create function to check the number of the user entered is correct or
    // * not random guessed number.
    public void isCorrectNumber() {
        while (noOfGuesses > 0) {
            int userNumber = takeUserInput();
            if (userNumber < computerRandomNumber) {
                System.out.println("Your number is Lower Than Random Number!");
                System.out.println("Try Again!");
                System.out.println();
            } else if (userNumber > computerRandomNumber) {
                System.out.println("Your number us Higher Than Random number!");
                System.out.println("Try Again!");
                System.out.println();
            } else {
                System.out.println("Congrats You got it right the correct number was " + computerRandomNumber);
                System.out.println();
            }
            noOfGuesses--;
            guessByUser++;
            System.out.println("You can have left the chances to guess the number " +
                    noOfGuesses + " Chances");
            System.out.println("You can guess the number in " + guessByUser + " Chances!");
            System.out.println();
        }
        System.out.println(
                "Sorry, you ran out of the try, you ran out of guesses. The correct number was \""
                        + computerRandomNumber + "\"");
    }
}

public class Exercise_3 {
    public static void main(String[] args) {
        // ? Create a instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // ? Create instance of the Game Class
        Game g1 = new Game();

        // ? Inform the user to guess the number between 1 to 100
        System.out.println("-- Guess the number between 1 to 100 --");

        // TODO: Call the method of the take user Input
        g1.isCorrectNumber();

        sc.close();
    }
}