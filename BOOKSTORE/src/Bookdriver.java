
//----------------------------
//Assignment#1
//Comp249
//Due 11:59pm-Friday,February 1
//Question:Part II
//Written by:NI ZENG ID:40045894
//----------------------------
import java.util.Scanner;//import object Scanner

/**
 * The Bookstore class that helps the store owner in keeping track of the books
 * at the store. it contain a static main methods to ask owner to input
 * information and creat someinformation. it includes constructers,mutaters ,
 * accessors,equals,findcheaperthan,find number created books and toString
 * methods
 * 
 * @Name(s)and ID(s) NI ZENG 40045894
 * @version 1.1
 */
public class Bookdriver {

    /**
     * @param args
     */
    public static void
           main(String[] args) {
        Scanner input = new Scanner(System.in);

        // the Bookdriver class has
        // some variables
        int maxBOOKs = 10;// the maxbook that can be stored in the bookstore

        final String PIN = "password";// define the password
        int times = 4;// allow user to input times

        int option;// to store which option number that the user choose
        String inputPIN;// to store the input password
        int pintimes;
        int newAdd;// to store the number of new added books
        int booknumber;// book number of update
        double priceMax;// to store input price limit
        String name;// to store author name that the user is looking for
        String title;
        String author;
        long ISBN;
        double price;

        String changeAuthor;
        String changeTitle;
        long changeISBN;
        double changePrice;

        // display welcome
        System.out.println("*******Welcome to my book system!*******");
        System.out.println("My book store can contain the maximum number of books are " + maxBOOKs + " books");
        Book inventory[] = new Book[maxBOOKs];// Create a array with maxBOOKs place to store the object book
        // Create two books that already in the shelf
        inventory[0] = new Book("Happy", "jary", 1000, 40.00);
        inventory[1] = new Book("Math", "leo", 1234, 50.00);
        System.out.println();

        // display the menu
        do {
            System.out.println("What do you want to do?" + "\n" + "1.Enter new books(password required" + "\n" + "2.Change information of a book(password required" + "\n" + "3.Display all books by a specific author" + "\n" + "4.Display all books under a certain a price." + "\n" + "5.Quit" + "\n" + "Please enter your choice > ");
            System.out.print("please Enter choice [1-5]: ");
            // define a object input and a int variable to store the input number
            option = input.nextInt();
            // using while loop to check if the number is between 1-5
            while (option > 5 || option < 1) {
                System.out.println("Your input does not match the criteria, please enter a number between 1and 5");
                option = input.nextInt();
            }

            // use if-else statement to control the flow
            if (option == 1) {
                pintimes = 3;// to allow user input pin 3 times always put in outside of do to control
                do {

                    System.out.println("please enter the password");
                    inputPIN = input.next();// to store the inputpassword
                    // use for loop to control the input
                    {// maxmum control is 3 times
                        if (PIN.equals(inputPIN)) {
                            System.out.println("how many new book you want to enter?");
                            newAdd = input.nextInt();
                            if (newAdd <= (maxBOOKs - Book.getcounter()))// still can add
                            {
                                for (int k = 2; k < newAdd + 2; k++) {// loop to create the new books
                                    System.out.println("please enter the information of new books ");
                                    System.out.println("please enter the title ");
                                    title = input.next();
                                    System.out.println("please enter the author ");
                                    author = input.next();
                                    System.out.println("please enter the ISBN ");
                                    ISBN = input.nextLong();
                                    System.out.println("please enter the price ");
                                    price = input.nextDouble();
                                    //after input the attributes,create new object books and put into shelf
                                    inventory[k] = new Book(title, author, ISBN, price);
                                }
                                break;
                                /*
                                 * System.out.println("Already created books number :" + Book.getcounter() +
                                 * "\n" + "Thanks for coming"); System.exit(0); ;// to get out program
                                 */
                            } else {
                                System.out.println("maxmum remaining space is " + (maxBOOKs - Book.getcounter()));
                                break;
                            }
                        }
                        // get a wrong pin
                        pintimes--;

                    }
                } while (pintimes > 0);
            }

            //to show main menu
            // after 3 attemps,get out the loop display menu again

            else if (option == 2) {
                times = 2;
                pintimes = 3;// to allow user input pin 3 times always put in outside of do to control
                do {
                    System.out.println("please enter the password");
                    inputPIN = input.next();// to store the inputpassword
                    // use for loop to control the input
                    // maxmum control is 3 times
                    if (PIN.equals(inputPIN)) {
                        System.out.println("which book number you want to update?");
                        booknumber = input.nextInt();
                        if (booknumber > Book.getcounter() - 1)// index start from o
                            System.out.println("there is no book at this location,would you reenter another one or quit and go back to the main menu?");
                        else {
                            do {
                                System.out.println("Book # " + booknumber + "\n" + inventory[booknumber]);
                                // will call the toString method 

                                System.out.println("which information would you like to change?" + "\n" + "1.author \n" + "2.title \n" + "3.ISBN \n" + "4.price \n" + "5.Quit \n" + "Enter your choice> \n");
                                System.out.print("Enter choice [1-5]: ");
                                // define a object input and a int variable to store the input number
                                int a;

                                a = input.nextInt();//to store the number information input

                                while (a > 5 || a < 1) {
                                    System.out.println("Your input does not match the criteria, please enter a number between 1and 5");
                                    a = input.nextInt();
                                }

                                //use if else to control the condition
                                if (a == 5) {
                                    break;
                                } else if (a == 1) {
                                    System.out.println("what you want to chang to ?");
                                    changeAuthor = input.next();
                                    inventory[booknumber].changAuthor(changeAuthor);

                                } else if (a == 2) {
                                    System.out.println("what you want to chang to ?");
                                    changeTitle = input.next();
                                    inventory[booknumber].changTitle(changeTitle);

                                } else if (a == 3) {
                                    System.out.println("what you want to chang to ?");
                                    changeISBN = input.nextLong();
                                    inventory[booknumber].changISBN(changeISBN);
                                } else if (a == 4) {
                                    System.out.println("what you want to chang to ?");
                                    changePrice = input.nextDouble();
                                    inventory[booknumber].changPrice(changePrice);

                                }

                            } while (booknumber <= Book.getcounter() - 1);
                        }
                    }

                    else//a wrong password
                        System.out.println("your password is not right,please enter again:");
                    pintimes--;
                    //to control the main menu show times
                    // break;//to show the main menu
                } while (pintimes > 0);

            }

            else if (option == 3) {
                System.out.println("please enter the password");
                inputPIN = input.next();// to store the inputpassword
                System.out.println("Please enter the name of the author ");
                name = input.next();
                for (int l = 0; l < Book.getcounter(); l++) {
                    if (inventory[l].findBookBy(name)) {
                        System.out.println(inventory[l] + "\n");
                    }

                }
                break;
            }

            else if (option == 4) {
                System.out.println("please enter the password");
                inputPIN = input.next();// to store the inputpassword
                System.out.println("Please enter a price ");
                priceMax = input.nextDouble();
                for (int l = 0; l < Book.getcounter(); l++) {
                    if (inventory[l].findCheaperThan(priceMax)) {
                        System.out.println(inventory[l] + "\n");
                    }
                }
                break;
            }

            else {
                System.out.println("Thanks for coming.");
                System.exit(0);
            }

            times--;
            System.out.println("already 1times wrong,show main menu ");
        } while (times > 0);

        System.out.println("Program detectected suspicious activities and will terminate immediatedly!");
    }

    private static void
            systemexit(int i) {
        // TODO Auto-generated method stub

    }

}
