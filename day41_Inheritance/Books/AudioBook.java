package day41_Inheritance.Books;

import day41_Inheritance.Books.Books;

public class AudioBook extends Books {
    /**
     * title inherited
     * author inherited
     * price inherited
     * toString()inherited
     * length
     * listen()
     */
    public String length;

    public void listen(){

        System.out.println("Listening to "+title);
    }

}
