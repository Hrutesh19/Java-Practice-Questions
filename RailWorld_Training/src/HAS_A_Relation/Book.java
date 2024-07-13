package HAS_A_Relation;

/***
 * Problem Statement:
 * Design a Java program for a library management system. The system should handle books and their authors.
 * Each book has a title, author, and publication year. Implement classes for `Book` and `Author` to represent these entities.
 * Illustrate the "HAS-A" relationship between a `Book` and an `Author` by storing an `Author` object inside each `Book` object.
 */

public class Book {
    String title;
    String author;
    int publicationYear;

    Book(String title, String author, int publicationYear){
        this.author=author;
        this.title=title;
        this.publicationYear=publicationYear;
    }

    class Author{


    }


}
