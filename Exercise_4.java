import java.util.*;

/*
 * You have to implement a library using Java Class.
 * Methods: addBook, issueBook, returnBook, showAvailableBook
 * Properties: Array to store the available books,
 * Array to store the issued books
 * And now you have implement a Library Functionality with Java Class and Object Oriented
 */

class Library {
    // ? Class Properties (And this is ArrayList this will set size automatically)
    ArrayList<String> availableBooks; // Available Books List
    ArrayList<String> issuedBooks; // Issued Books List
    ArrayList<String> borrowedBooks; // Borrowed Books List
    ArrayList<String> returnedBooks; // Returned Books List

    Library() { // ? This is the constructor of the class Library
        this.availableBooks = new ArrayList<>();
        this.issuedBooks = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
        this.returnedBooks = new ArrayList<>();
    }

    // ? This is Book add Function
    public void addBook(String book) {
        this.availableBooks.add(book); // * This add method will add an element to the arrayList
        System.out.println(book + " - is added to the library"); // Printing that the book has been added
    }

    // ? This is Book issue Function
    public void issueBook(String book) {
        this.issuedBooks.add(book);
        System.out.println(book + " - is issued by a user");
        this.availableBooks.remove(book); // Removing the book from the available list after it's issued
        this.borrowedBooks.add("Borrowed : " + book);
    }

    // ? This is Book return Function
    public void returnBook(String book) {
        this.returnedBooks.add(book);
        System.out.println(book + " - is returned by a user");
        int index = this.issuedBooks.indexOf(book); // Finding the Index of the book in the issued list
        if (index != -1) { // If the book is found in the issued list then only we can remove it
            this.issuedBooks.remove(index); // Removing the book from the issued list
            this.availableBooks.add(book); // Adding the book back to the available list
            this.borrowedBooks.remove("Borrowed : " + book); // Removing the record of the book from the
            // borrowed list as well
        } else {
            System.out.println("The given book is not found or already returned.");
        }
    }

    // ? This is Book Availability Function
    public void showAvailableBook() {
        System.out.println(this.availableBooks);
        System.out.println();
    }
}

public class Exercise_4 {
    public static void main(String[] args) {
        // ? Create instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // ? Create a object of the class Library
        Library l1 = new Library();

        // ? Properties of the class Main
        int choice;

        do {
            // ? get the choice from the user what user should do
            System.out.println("-- Welcome to our Library --");
            System.out.println("1. Add-Book");
            System.out.println("2. Issue-Book");
            System.out.println("3. Return-Book");
            System.out.println("4. Show Available Book");
            System.out.print("Enter Your Choice From the Above : ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    // ? Now Get the Book from the user
                    System.out.print("Enter the book you want to add : ");
                    String book = sc.nextLine();
                    l1.addBook(book); // ? This will call the addBook() function to add the book
                    System.out.println();
                    break;

                case 2:
                    // ? Now Issued the Book from the library
                    System.out.print("Enter The Book Name You Want to Issue : ");
                    String book1 = sc.nextLine();
                    l1.issueBook(book1); // ? This will call the issueBook() function
                    System.out.println();
                    break;

                case 3:
                    // ? Now Return the Book from the User
                    System.out.print("Enter the name of the book you want to return : ");
                    String rtnBook = sc.nextLine();
                    l1.returnBook(rtnBook); // ? This will call the returnBook() function
                    System.out.println();
                    break;

                case 4:
                    // ? Not Show Available Books
                    l1.showAvailableBook();
                    System.out.println();
                    break;

                default:
                    System.out.println("Enter the valid choice!");
                    break;
            }
        } while (choice != 3);
    }
}
