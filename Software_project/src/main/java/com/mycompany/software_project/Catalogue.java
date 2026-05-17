package com.mycompany.software_project;

import java.util.ArrayList;

public class Catalogue {

    private static Catalogue instance;

    ArrayList<Book> books;

    private Catalogue() {
        books = new ArrayList<>();
    }

    public static Catalogue getInstance() {
        if (instance == null) {
            instance = new Catalogue();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

}