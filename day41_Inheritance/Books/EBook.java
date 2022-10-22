package day41_Inheritance.Books;

import day41_Inheritance.Books.Books;

public class EBook extends Books {
    /**
     * title inherited
     * author inherited
     * price inherited
     * toString() inherited
     * size
     * pages
     * readbook() action
     */

    public String size;
    public int pages;

    public void readBook(){

        System.out.println("Reading "+ title);
    }


}
