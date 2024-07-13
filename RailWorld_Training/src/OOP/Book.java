package OOP;


/***
 * 7. Define a class named Book with attributes title, author, and num_pages.
 * Include a method get_short_summary() that returns a brief summary of the book
 * (e.g., title, author, and numbers of pages).
 */
public class Book {
    String author ;
    String title;
    int numPages;

    Book(String author, String title ,int numPages){
        this.author= author;
        this.title=title;
        this.numPages= numPages;
    }

    public void getshortSummary(){
        System.out.println("Name of Author: "+author);
        System.out.println("Book title: "+title);
        System.out.println("Number of Pages: "+numPages);
    }

    public static void main(String[] args) {
        Book b = new Book("J. K. Rowling", "Harry Potter",500);
        b.getshortSummary();
    }
}
