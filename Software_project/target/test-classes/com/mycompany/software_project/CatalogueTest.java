package com.mycompany.software_project;

public class CatalogueTest {

    public static void main(String[] args) {

        Catalogue catalogue = Catalogue.getInstance();

        Book book1 = new Book(
                "B101",
                "Java",
                200,
                10,
                5,
                "OReilly"
        );

        Book book2 = new Book(
                "B102",
                "C++",
                300,
                8,
                5,
                "Pearson"
        );

        catalogue.addBook(book1);
        catalogue.addBook(book2);

        System.out.println("===== CATALOGUE TEST =====");

        System.out.println("Books added successfully");
    }
}