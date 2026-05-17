package com.mycompany.software_project;

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book(
                "B101",
                "Java Programming",
                250,
                10,
                5,
                "OReilly"
        );

        System.out.println("===== BOOK TEST =====");

        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Publisher: " + book.getPublisher());
    }
}