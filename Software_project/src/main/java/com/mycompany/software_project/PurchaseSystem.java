package com.mycompany.software_project;

public class PurchaseSystem implements StockObserver {
    @Override
    public void update(Book book) {

        System.out.println("Book : " + book.getTitle());
        System.out.println("Publisher" + book.getPublisherName());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Quantity : " + book.getMinThreshold());

        System.out.println("Stock updated for book: " + book.getTitle());
    }

}
