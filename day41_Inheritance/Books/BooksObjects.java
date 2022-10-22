package day41_Inheritance.Books;

import day41_Inheritance.Books.AudioBook;
import day41_Inheritance.Books.EBook;

public class BooksObjects {

    public static void main(String[] args) {

        EBook book1 = new EBook();
        //Class      obj

        book1.title = "The Snowman";
        book1.author = "Joe Nesbo";
        book1.price = 13.20;
        book1.size = "1.5MB";
        book1.pages = 310;

        System.out.println(book1);
        System.out.println("size: " + book1.size);
        System.out.println("pages: " + book1.pages);

        book1.readBook();
        System.out.println("=======================");
        AudioBook book2 = new AudioBook();

        book2.title = "Nutuk";
        book2.author = "ATATURK";
        book2.price = 40.0;
        book2.length = "90 hours and 3 minutes";
        System.out.println("Length of the audio book: \""+book2.title+"\" is becoming is "+ book2.length);
        System.out.println(book2);
        book2.listen();


    }
}
