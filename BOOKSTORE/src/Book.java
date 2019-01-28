//----------------------------
//Assignment#1
//Comp249
//Due 11:59pm-Friday,February 1
//Question:Part I
//Written by:NI ZENG ID:40045894
//----------------------------
/**
 * The Book class is to create book object with four attributes . it includes
 * constructors,mutators , accessors,equals,findcheaperthan,find number created
 * books and toString methods
 * 
 * @Name(s)and ID(s) NI ZENG 40045894
 * @version 1.1
 */
public class Book {
    //the Book class has
    //four fields
    private String     title;
    private String     author;
    private long       ISBN;
    private double     price;
    private static int counter = 0;//to store how many books already created

    /**
     * Pass by four parameters to create a book object.
     * 
     * @param startTitle
     *            an String value
     * @param startAuthor
     *            an String value
     * @param startISBN
     *            an long value
     * @param startPrice
     *            an double value set attributes
     */
    //the Book class has
    //one Constructor
    public Book(String startTitle, String startAuthor, long startISBN, double startPrice) {
        title = startTitle;
        author = startAuthor;
        ISBN = startISBN;
        price = startPrice;
        counter += 1;
    }

    /**
     * Create a Book object with default method.
     * 
     * @param nothing
     *            set attributes
     */
    //default constructor
    public Book() {
        title = null;
        author = null;
        ISBN = 0;
        price = 0;
        counter += 1;

    }

    //the Book class has 
    //six methods
    //Mutators
    public void
           setTitle(String newvalue) {
        title = newvalue;
    }

    public void
           setAuthor(String newvalue) {
        author = newvalue;
    }

    public void
           setISBN(long newvalue) {
        ISBN = newvalue;
    }

    public void
           setPrice(double newvalue) {
        price = newvalue;
    }

    //accessors
    public String
           getTitle() {
        return title;
    }

    public String
           getAuthor() {
        return author;
    }

    public long
           getISBN() {
        return ISBN;
    }

    public double
           getPrice() {
        return price;
    }

    public static int
           getcounter() {//to get counter how many books already created
        return counter;
    }

    /**
     * methods to print the information of a book object
     * 
     * @param nothing
     * @return String value
     */
    //toString methods
    public String
           toString() {
        return ("Author: " + getAuthor() + "\n" + "Title: " + getTitle() + "\n" + "ISBN: " + getISBN() + "\n" + "Price: " + getPrice() + "\n");

    }

    /**
     * methods to find how many books have been created
     * 
     * @param nothing
     * @return counter integer value
     */
    //findNumberofcreatedbooks methods
    private static int
            findNumberOfCreatedBooks() {
        return counter;
    }

    /**
     * methods to find books that equal the passing another book
     * 
     * @param another
     *            Book value
     * @return boolean
     */
    //equals methods
    public boolean
           equals(Book another) {
        if (ISBN == another.ISBN && price == another.price) {
            return true;
        } else
            return false;
    }

    /**
     * methods to find books that under the passing price
     * 
     * @param pricer
     *            double value
     * @return boolean
     */
    public boolean
           findCheaperThan(double price) {//not sure
        if (this.getPrice() < price) {
            return true;
        } else
            return false;
    }

    /**
     * methods to find books that under the passing author name
     * 
     * @param author
     *            String value
     * @return boolean
     */
    public boolean
           findBookBy(String author) {
        if (this.author.equals(author)) {
            return true;
        } else
            return false;

    }

    public void
           changAuthor(String a) {
        author = a;
    }

    public void
           changTitle(String a) {
        title = a;
    }

    public void
           changISBN(long a) {
        ISBN = a;
    }

    public void
           changPrice(double changeTitle) {
        price = changeTitle;
    }

}
